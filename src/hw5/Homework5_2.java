package hw5;

public class Homework5_2 {
	public static void main(String[] args) {
		System.out.println("本次亂數結果與平均為:");
		System.out.println(randAvg());
	}
	public static double randAvg() {
		int tenRandNum[]=new int[10];
		int sum=0;
		for(int i=0;i<10;i++) {
			tenRandNum[i]=(int)(Math.random()*101);
			sum +=tenRandNum[i]; 
			System.out.print(tenRandNum[i]+" ");
		}
		System.out.println();
		return (double)sum/10;
		
	}
}
