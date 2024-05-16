package hw7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework7_3 {
	public static void copyFile(String inputFile,String outputFile) throws IOException {
		//建立輸入輸出通道
		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		int c;
		//抓輸入放在c 再寫至輸出
		while ((c = in.read()) != -1) {
			out.write(c);
			System.out.flush();
		}
		
		//關通道
		in.close();
		out.close();
	}
}
