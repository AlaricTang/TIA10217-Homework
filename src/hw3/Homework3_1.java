package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數，輸入-1結束");
		int exitNo= sc.nextInt();
		
		while(exitNo!=-1) {
			int triangle[] = {exitNo,sc.nextInt(),sc.nextInt()}; 
			Arrays.sort(triangle);
			
			if ( triangle[0]+triangle[1]>triangle[2]) { //是三角形
				if (triangle[0] == triangle[1] && triangle[1]== triangle[2])
					System.out.println("正三角形");
				else if (triangle[1]== triangle[0] || triangle[1]==triangle[2]) 
					System.out.println("等腰三角形");
				else if (Math.pow(triangle[0], 2)+Math.pow(triangle[1], 2)==Math.pow(triangle[2], 2)) 
					System.out.println("直角三角形");
				else System.out.println("其他三角形");
			}else System.out.println("不是三角形");
			
			System.out.println("請輸入三個整數，輸入-1結束");
			exitNo = sc.nextInt();
		}
		System.out.println("結束!");
		sc.close();
	}
}
