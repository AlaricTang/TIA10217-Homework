package hwExt_1;

abstract class Pen {
	private String brand;
	private double price;
	
	public Pen(){};
	public Pen(String brand,double price){
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public abstract void write();
}

class Pencil extends Pen{
	public Pencil() {
		super();
	}
	public Pencil(String brand,double price) {
		super(brand,price);
	}
	public double getPrice() {
		return super.getPrice()*0.8;
	}
	public double getPrice() {
		return super.getPrice()*0.8;
	}
	public void write() {
		System.out.println("削鉛筆再寫");
	}
}

class InkBrush extends Pen{
	
	public InkBrush() {
		super();
	}
	public InkBrush(String brand,double price) {
		super(brand,price);
	}
	public String getBrand() {
		return super.getBrand();
	}
	public double getPrice() {
		return super.getPrice()*0.9;
	}
	public void write() {
		System.out.println("沾墨汁再寫");
	}
}

public class HomeworkExt_1 {
	public static void main(String[] args) {
		
		Pen p[]=new Pen[2];
		p[0] = new Pencil("嘻嘻",1000);
		p[1]= new InkBrush("哈哈",1000);
		
		for(int i=0;i<p.length;i++) {
			p[i].write();
			System.out.println("品牌為: "+p[i].getBrand()+"\n價格為: "+p[i].getPrice());
		}
	}
}
