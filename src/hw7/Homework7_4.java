package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//有IO記得throws IOException
public class Homework7_4 {
	public static void main(String[] args)throws IOException {
		//這是資料夾路徑的物件
		File f1 = new File("c:\\data");
		//沒資料夾就新建一個
		if(!f1.exists()) {
			f1.mkdir();
		}
		//這是輸出檔案通道，輸出的東東為物件 //Object只能接 Input/OutputStream
		FileOutputStream outputFile = new FileOutputStream("c:\\data\\Object.ser");
		BufferedOutputStream bfw_output = new BufferedOutputStream(outputFile);
		ObjectOutputStream ps_output = new ObjectOutputStream(bfw_output);
		
		//創物件
		Animal  cc1 = new Cat("CC1");
		Animal  cc2 = new Cat("CC2");
		Animal  dd1 = new Dog("DD1");
		Animal  dd2 = new Dog("DD2");
		
		//物件寫進去
		ps_output.writeObject(cc1);
		ps_output.writeObject(cc2);
		ps_output.writeObject(dd1);
		ps_output.writeObject(dd2);
		
		//關通道
		ps_output.close();
		bfw_output.close();
		outputFile.close();
	}
}
