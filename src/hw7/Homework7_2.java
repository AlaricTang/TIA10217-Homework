package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Homework7_2 {
	public static Set<Integer> getRandom(Integer Num) {
		Set<Integer> list = new HashSet<Integer>();
		while(list.size()!=Num) {
			list.add((int)(Math.random()*1000+1));
		}
		return list;
		
		
	}
	
	public static void main(String[] args) {
		try {
			FileWriter fr = new FileWriter("D:\\TIA102_Workspace\\classHomework\\Data.txt",true);
		
			BufferedWriter bw = new BufferedWriter(fr);
			PrintWriter pw = new PrintWriter(bw);
			
			Iterator<Integer> obj = getRandom(10).iterator();
			while(obj.hasNext()) {
				pw.print(obj.next()+" ");
			}
			System.out.println();
			pw.close();
			bw.close();
			fr.close();
		} catch (IOException e) {
			System.err.println(e);
		}
		
		
	}
}
