package hw3;

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*101);
		
		System.out.println("請輸入一個整數");
		int input = sc.nextInt();
		
		while (input!=answer) {
			if (input > answer)
				System.out.println("你大於正確答案");
			else
				System.out.println("你小於正確答案");
			input = sc.nextInt();
		}
		System.out.print("答對了，答案就是"+ answer);
		sc.close();
	}
}
