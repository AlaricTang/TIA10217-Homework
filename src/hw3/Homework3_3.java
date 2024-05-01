package hw3;

//import java.util.ArrayList;
import java.util.Scanner;

public class Homework3_3 {
	public static void main(String args[]) {
		int passNum=0,count=0;
		int unlikeNum,catchIndex;
		int randomCount=0;
		
		Scanner sc = new Scanner(System.in);
		int numbox[]=new int[49];//建立array
//		ArrayList<Integer> numbox = new ArrayList<Integer>();	//建立list

		System.out.println("輸入你不喜歡的數(1~9)");
		unlikeNum = sc.nextInt();
		System.out.printf("你可以選擇以下數字:");
		for(int num=1; num<=49;num++) { //numbox 放入Number
			if((num%10)==unlikeNum || (num/10)==unlikeNum) { 
				passNum++;
				continue;
			}
			count++;
			numbox[num-passNum-1]= num;
//			numbox.add(num);
			if((num-passNum)%6==1) System.out.println();
			System.out.printf("%d\t",num);
		}
		
		System.out.println("總共有"+count+"數可選\n可選數之隨機選6數:");
		while(randomCount++ !=6) {
			catchIndex = (int)(Math.random()*(48-passNum));//抓出我要的index,跟最後一個交換,print出來
			System.out.print(numbox[catchIndex]+" ");
			numbox[48-passNum]=numbox[catchIndex]^ numbox[48-passNum];
			numbox[catchIndex]=numbox[catchIndex]^ numbox[48-passNum];
			numbox[48-passNum]=numbox[catchIndex]^ numbox[48-passNum];
			passNum++;
		}
		
//		for(int printNum =0;printNum<6;printNum++) {	//抓出來印 會自動調整array
//			catchIndex = (int)(Math.random()*(cache.size()+1));
//			System.out.print(cache.get(catchIndex)+" ");
//			cache.remove(catchIndex);
//		}
		
		sc.close();
	}
}
