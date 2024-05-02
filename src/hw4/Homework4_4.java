package hw4;
import java.util.Scanner;

public class Homework4_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		member a = new member(25,2500);
		member b = new member(32,800);
		member c = new member(8,500);
		member d = new member(19,1000);
		member e = new member(27,1200);
		member coworker[]= {a,b,c,d,e};
//		int coworker[][] = {{25,32,8,19,27},{2500,800,500,1000,1200}};  //二維方法
		
		System.out.println("輸入小華要借多少");
		int borrow = sc.nextInt();

		int howmany=0;
		System.out.print("員工編號: ");
		for(int i=0;i<5;i++) {
			if(coworker[i].cash >= borrow) {
				System.out.print(coworker[i].number+" ");
				howmany ++;
			}
		}
//		for (int i=0; i < coworker[1].length; i++) {
//	 		if (coworker[1][i] >= borrow) { 
// 				System.out.print(coworker[0][i]+" ");
//		 		howmany++;
//		 	}
//		 }
		System.out.printf("共%d人!",howmany);
		sc.close();
	}
}
class member{
	int number ;
	int cash;
	member(int number,int cash) {
		this.number=number;
		this.cash=cash;
	}
}
