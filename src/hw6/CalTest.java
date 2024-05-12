package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculator exp = new Calculator();
		while(true) { 
			try {
				System.out.println("請輸入x的值:");
				exp.setX(sc.nextInt());			
				System.out.println("請輸入y的值:");
				exp.setY(sc.nextInt());
				System.out.println(exp.getX()+"的"+exp.getY()+"次方等於"+exp.powerXY());
				break;
			} catch(InputMismatchException num) {
				System.out.println("請輸入正確格式");
				sc.next();
			} catch (CalException e) {
				System.out.println(e.getMessage());
			}
		}
		sc.close();
	}
}