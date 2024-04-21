package hw2;

public class Homework2 {
	public static void main(String args[]){
		System.out.println("====Question 1====");
		int sum1 = 0;
		for(int i=2;i<=1000 ;i++) {
			if(i%2==0)
				sum1 += i;
		}
		System.out.println(sum1);
		
		System.out.println("\n====Question 2====");
		int sum2=1;
		for(int i=1;i<=10;i++) {
			sum2*=i;
		}
		System.out.println(sum2);
		
		System.out.println("\n====Question 3====");
		int sum3=1;
		int multuNum=1;
		while(multuNum<=10) {
			sum3*=multuNum;
			multuNum++;
		}
		System.out.println(sum3);

		System.out.println("\n====Question 4====");
		for(int j=1;j<=10;j++) {
			System.out.printf("%d ",j*j);
		}
		
		System.out.println();
		System.out.println("\n====Question 5====");
		for(int num=1; num<=49;num++) {
			if((num%10)==4 || (num/10)==4) { 
				continue;
			}
			System.out.printf("%d ",num);
		}
		
		System.out.println();
		System.out.println("\n====Question 6====");
		for(int i=10;i>0;i--) {
			for(int j=1; j<=i; j++) {
				System.out.printf("%d ",j );
			}
			System.out.println();
		}
		
		System.out.println("\n====Question 7====");
		for(int i='A';i<='F';i++) {
			for(int j=1;j<=(i-'A'+1);j++) {
				System.out.printf("%c",i );
			}
			System.out.println();
		}
	}
}
