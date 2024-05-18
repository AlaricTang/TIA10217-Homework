package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Homework8_1 {
	public static void main(String[] args) {
		Collection<Object> list = new ArrayList<>();	//建list
		
		Object objBeInput = new Object();
		BigInteger bigInt = new BigInteger("1000");
		
		//放入物件
		list.add(100);
		list.add(3.14);
		list.add(21L);
		list.add((short)100);
		list.add(5.1);
		list.add("Kitty");
		list.add(100);
		list.add(objBeInput);
		list.add("snoopy");
		list.add(bigInt);
		
		//各種印的方法
		Iterator<Object> listIt = list.iterator();
		while(listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		System.out.println("------------------");
		for(int i=0;i<list.size();i++) {
			Object objFor = ((List<Object>)list).get(i);
			System.out.println(objFor);
		}
		System.out.println("------------------");
		for(Object objForEh:list) {
			System.out.println(objForEh);

		}
		System.out.println("------------------");
		Iterator<Object> listIt2 = list.iterator();	//remove 需要使用迭代器的方法來修改 不然會丟出exception
		while(listIt2.hasNext()) {
			Object objOfListIt2 = listIt2.next();
			if(!( objOfListIt2 instanceof Number)) {
				listIt2.remove();
			}else {
				System.out.println(objOfListIt2);
			}
		}

	}
}
