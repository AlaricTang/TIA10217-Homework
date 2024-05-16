package hw7;

import java.io.Serializable;
//輸出物件需序列化，記得給VersionUID
public class Cat extends Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
}
