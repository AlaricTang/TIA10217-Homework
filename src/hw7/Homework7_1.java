package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Homework7_1 {
	public static void p(String s) {
		System.out.print(s);
	}
	public static void p(int s) {
		System.out.print(s);
	}
	public static void main(String[] args) throws IOException {
		int numOfChar=0;
		int numOfLine=0;
		File f1 = new File("D:\\TIA102_Workspace\\classHomework\\src\\hw7\\Sample.txt");
		
		FileReader fr = new FileReader(f1);
		BufferedReader bfr = new BufferedReader(fr);

		System.out.print("Sample.txt檔案共有: ");
		System.out.print(f1.length()+" bytes，");

		String li;
		while((li=bfr.readLine())!= null) {
			numOfLine++;
			numOfChar += li.length()+1; //+1是因為換行
//			System.out.println(li.length());//我在測試每一行掃到的長度
		}
		System.out.print(numOfChar+"個chars ");
		System.out.print(numOfLine+"列資料");
		
		bfr.close();
		fr.close();
	}
}
