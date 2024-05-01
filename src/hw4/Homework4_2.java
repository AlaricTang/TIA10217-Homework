package hw4;

//import java.util.Scanner;

public class Homework4_2 {
	public static void main (String args[]) {
//		Scanner sc = new Scanner(System.in);
		System.out.println("input=");
//		String input = sc.next();
		String input = "hello world";
		char outputArray[]=new char[input.length()];//建array長度

		for(int i=0;i<input.length();i++) {
			int j=input.length()-i;
			outputArray[i] = input.charAt(j-1);
		}
		for(int i=0; i< input.length();i++) {
			System.out.printf("%c",outputArray[i]);
		}
//		sc.close();
	}
}
