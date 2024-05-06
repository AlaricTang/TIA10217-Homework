package hwExt_2;

public class ArrowMan extends Hero{
	
	public ArrowMan() {
		super();
	}

	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp);
	}

	public void attack() {
		System.out.println("放弓箭");
	}

}
