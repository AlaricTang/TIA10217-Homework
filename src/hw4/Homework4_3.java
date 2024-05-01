package hw4;

public class Homework4_3 {
	
	public static void main(String args[]) {
		String planet[]={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int sum=0;
		for(int i =0;i<planet.length;i++) {
			sum += aeiou(planet[i]);
		}
		System.out.print(sum);
	}
	
	
	public static int aeiou(String beCount) {
		int count=0;
		for(int i=0;i<beCount.length();i++) {
			if(	beCount.charAt(i)=='a' ||
					beCount.charAt(i)=='e' ||
					beCount.charAt(i)=='i' ||
					beCount.charAt(i)=='o' ||
					beCount.charAt(i)=='u' ) count++;
		}
		return count;
	}
}
