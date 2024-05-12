package hw6;

public class Calculator {
	private int x;
	private int y;
	
	public Calculator () {};
	public Calculator (int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public double powerXY() throws CalException{
		if(x==0 && y==0) {
			throw new CalException("0的0次方沒有意義");
		}else if(y<0) {
			throw new CalException("次方為負值，結果回傳不為整數");
		}else {
			return Math.pow((double)x, (double)y);
		}
	}
	
}
