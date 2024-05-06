package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle MyRectangle1 = new MyRectangle();
		MyRectangle MyRectangle2 = new MyRectangle(10,20);
		
		MyRectangle1.setWidth(10);
		MyRectangle1.setDepth(20);
		System.out.println("MyRectangle1的面積為: "+MyRectangle1.getArea());
		System.out.println("MyRectangle2的面積為: "+MyRectangle2.getArea());
	}
}
