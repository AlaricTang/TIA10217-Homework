package hw4;
import java.util.Scanner;
public class Homework4_5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int monthDay[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int sum=0;
		System.out.println("輸入三個整數分別代表西元yyyy年mm月dd日");
		int date[]= {sc.nextInt(),sc.nextInt(),sc.nextInt()};
		
		if (date[0]%4==0 && 
				((date[0]%100==0 && date[0]%400==0)||date[0]%100!=0)) {
			monthDay[2]=29;
		}
		
		if(date[2] > monthDay[date[1]]) System.out.println("日期錯誤");
		else {	
			for(int i=1;i<=date[1]-1;i++) {
				sum += monthDay[i];
			}
			sum += date[2];
			System.out.printf("輸入的日期為該年第%d天",sum);
		}
		sc.close();

		
//		if((date[1]==1||date[1]==3||date[1]==5||date[1]==7||//大月
//		   date[1]==8||date[1]==10||date[1]==12)&& date[2]>31)
//			System.out.println("日期錯誤");
//		else if((date[1])==2 && leap_year==1 && date[2]>29)//閏月
//			System.out.println("日期錯誤");
//		else if(date[1]==2 && leap_year==1 && date[2]>28)//非閏月
//			System.out.println("日期錯誤");
//		else if(date[2]>30)//其他小月
//			System.out.println("日期錯誤");
//		
		
	}

}
