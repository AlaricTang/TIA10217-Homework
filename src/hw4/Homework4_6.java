package hw4;

public class Homework4_6 {
	public static void main(String args[]) {
		int grade[][]={{0,0,0,0,0,0,0,0},
						{10,35,40,100,90,85,75,70},
						{37,75,77,89,64,75,70,95},
						{100,70,79,90,75,70,79,90},
						{77,95,70,89,60,75,85,89},
						{98,70,89,90,75,90,89,90},
						{90,80,100,75,50,20,99,75}};
		
		for(int i=1;i < grade.length;i++) {
			int max =0;
			int classNum=0;
			for(int j=0;j < grade[i].length;j++) {
				if (grade[i][j]>max) {
					max = grade[i][j];
					classNum = j;
				}
			}
			grade[0][classNum]++;
		}
		for(int i=0 ;i<8;i++) {
			System.out.println((i+1)+"號考最高分的次數為"+(grade[0][i])+"次");
		}
		
//		for(int i=0;i < grade.length;i++) { //這邊寫成第幾次考最高
//			int max =0;
//			int testTime=0;
//			for(int j=0;j < grade[i].length;j++) {
//				if (grade[i][j]>max) {
//					max = grade[i][j];
//					testTime=j+1;
//				}
//			}
//			System.out.println((i+1)+"號最高分的次數為"+testTime);
//		}
	}
}
