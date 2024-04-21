package hw1;

public class TestNineNine {
	public static void main(String args[]) {
		for(int i = 1;i <= 9;i++) {
			int j = 0;
			while(j++<9) {
				System.out.printf("%dx%d=%d\t",i,j,i*j);
			}
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
		for(int x = 1;x <= 9 ;x++) {
			int y = 1;
			do {
				System.out.printf("%dx%d=%d\t",x,y,x*y);
				y++;
			}while(y < 10);
			System.out.printf("\n");
		}
		
		System.out.printf("\n");
		
		int a = 1;
		while(a < 10) {
			int b = 1;
			do {
				System.out.printf("%dx%d=%d\t",a,b,a*b);
				b++;
			}while(b < 10);
			a++;
			System.out.printf("\n");
		}
	}
}
