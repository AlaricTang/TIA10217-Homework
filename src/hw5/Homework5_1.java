package hw5;

import java.util.Scanner;

public class Homework5_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("如欲產生一Square，請輸入其寬與高:");
		starSquare(sc.nextInt(),sc.nextInt());
		sc.close();
	}
	public static void starSquare(int width,int height) {
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
