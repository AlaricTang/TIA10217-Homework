package hw3;

import java.util.Scanner;

public class Homework3_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數");
		int x,y,z;
//		int exitNo = 1;
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		while(x != -1) {
			
			if ( x==0 || y==0 || z==0) System.out.println("不是三角形");
			else if (x == y && y== z) System.out.println("正三角形");
			else if (x==z) System.out.println("等腰三角形");
			else if (((x*x+y*y)==z*z)||
					 ((y*y+z*z)==x*x)||
					 ((x*x+z*z)==y*y)) System.out.println("直角三角形");
			else System.out.println("其他三角形");	
			System.out.println("再輸入三個整數,第一個輸入-1結束");
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
		}
		sc.close();
	}
}
