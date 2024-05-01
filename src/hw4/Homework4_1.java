package hw4;


public class Homework4_1 {
	
	public static void main(String args[]) {
		int sum1=0,avg1;
		int q1[] = {29,100,39,41,50,8,66,77,95,15};
		for(int i=0;i<q1.length;i++) {
			sum1 += q1[i]; 
		}
		avg1 = sum1/q1.length;
		int a=0;
		System.out.println("平均值為:"+avg1);
		System.out.printf("大於平均值的元素: ");
		while(a < q1.length) {
			if (q1[a]>avg1) System.out.printf("%d ", q1[a]);
			a++;
		}
	}
}
