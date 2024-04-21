package hw1;

public class Test4Numbers {
	public static void main(String args[]) {
		int i = 0;
		while(i<= 100) {
			System.out.printf("%d ",i);
			i+=4;
		}
		System.out.printf("\n");
		
		for(int j =0;j<=100;j+=4) {
			System.out.printf("%d ",j);
		}
		System.out.printf("\n");
		
		int result = 0;
		for(int k = 0;k<=((100/4));k++) {
			System.out.printf("%d ",result);
			result+=4;
		}
	}
}
