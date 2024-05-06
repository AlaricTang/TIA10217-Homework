package hw5;

import java.util.Arrays;

public class Homework5_3 {
	public static class Work03{
		int maxElement(int intArray[][]) {
			int sum=0;
			int lastColumn = intArray[0].length;
			for(int i=0;i<intArray.length;i++) {
				Arrays.sort(intArray[i]);
				if(intArray[i][lastColumn-1] > sum)
					sum = intArray[i][lastColumn-1];
			}
			return sum;
		}
		double maxElement(double doubleArray[][]) {
			double sum=0;
			int lastColumn = doubleArray[0].length;
			for(int i=0;i<doubleArray.length;i++) {
				Arrays.sort(doubleArray[i]);
				if(doubleArray[i][lastColumn-1] > sum)
					sum = doubleArray[i][lastColumn-1];
			}
			return sum;
		}
	}
	
	public static void main(String[] args) {
		int intArray[][]= {{1,6,3},{9,5,2}};
		double doubleArray[][]= {{1.2, 3.5, 2.2},{7.4, 2.1, 8.2}};
		Work03 w = new Work03();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
		
	}
}
