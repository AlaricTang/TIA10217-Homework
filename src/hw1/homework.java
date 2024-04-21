package hw1;

public class homework {
	public static void main(String args[]) {
		System.out.println("====Question 1====");
		System.out.printf("12+6=%d \n12*6=%d\n",12+6,12*6 );
		
		System.out.println("====Question 2====");
		System.out.printf("200顆蛋為 %d打%d顆\n",200/12,200%12);
		
		System.out.println("====Question 3====");
		System.out.printf("256559秒為 %d天 %d小時 %d分 %d秒\n",
				256559/(60*60*24),
				256559%(60*60*24)/(60*60),
				256559%(60*60)/60,
				256559%60);
		
		System.out.println("====Question 4====");
		final double pi = 3.1415;
		int radius = 5;
		double circle_area = radius*radius*pi;
		double circle_perimeter=radius*2*pi;
		System.out.println("圓面積="+circle_area);
		System.out.println("圓周長="+circle_perimeter);
		
		System.out.println("====Question 5====");
		double base=1_500_000;
		double R = 1.02;
		double result = base *Math.pow(R, 10); 
//		for(int i=0;i<10;i++) {
//			base = base*1.02;
//		}
		
//		int i=0;
//		while(i++<10) {
//			base = base*1.02;
//		}
		
//		int i = 0;
//		while(true) {
//			base = base*1.02;
//			i++;
//			if (i==10)break;
//		}
		
		System.out.println("本金加息為"+result);
		
		System.out.println("====Question 6====");
		System.out.println(5+5);//為數值相加
		System.out.println(5+'5');//為數值5與字元5之Unicode相加
		System.out.println(5+"5");//為字串相加,因"5"為字串
		
	}
}
