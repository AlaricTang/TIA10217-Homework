package hw4;

public class Homework4_6 {
	public static void main(String args[]) {
		int grade[][]={{10,37,100,77,98,90},
				 	   {35,75,70,95,70,80},
				 	   {40,77,79,70,89,100},
				 	   {100,89,90,89,90,75},
				 	   {90,64,75,60,75,50},
				 	   {85,75,70,75,90,20},
				 	   {75,70,79,85,89,99},
				 	   {70,95,90,89,90,75}};
		for(int i=0;i < grade.length;i++) {
			int max =0;
			int testTime=0;
			for(int j=0;j < grade[i].length;j++) {
				if (grade[i][j]>max) {
					max = grade[i][j];
					testTime=j+1;
				}
			}
			System.out.println((i+1)+"號最高分的次數為"+testTime);
		}
	}
}
