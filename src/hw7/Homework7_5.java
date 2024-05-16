package hw7;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Homework7_5 {
	public static void main(String[] args)throws IOException,ClassNotFoundException {
		//這是資料夾路徑的物件
		File input_file=new File("C:\\data\\Object.ser");
		
		//這是輸入檔案通道 ，輸入的東東為物件
		FileInputStream fips_input = new FileInputStream(input_file);
		BufferedInputStream bfips_input = new BufferedInputStream(fips_input);
		ObjectInputStream objips_input = new ObjectInputStream(bfips_input);
		
		//要寫成一行就用他們的父類別 //記得IO要throws
		try {
			while (true)
				((Animal)objips_input.readObject()).speak();
		} catch (EOFException e) {
			System.out.println("資料讀取完畢");
		}
		//關通道
		objips_input.close();
		bfips_input.close();
		fips_input.close();
		
	}
}
