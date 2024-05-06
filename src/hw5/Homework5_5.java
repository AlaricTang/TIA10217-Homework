package hw5;

public class Homework5_5 {

	public static void main(String[] args) {
		System.out.println(getAuthCode());
	}

	public static String getAuthCode() {
		char randCode[]=new char[8];
		int randNum,i=0;
		while(i!=randCode.length) {
			randNum=(int)(Math.random()*75)+48;
			if( (47<randNum && randNum<58)||	//0~9
				(64<randNum && randNum<91)||	//A~Z
				(96<randNum && randNum<123)  )	//a~z
				randCode[i++]=(char)randNum;
		}
		return String.valueOf(randCode);
	}
}
