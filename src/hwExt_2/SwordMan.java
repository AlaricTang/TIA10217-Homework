package hwExt_2;

public class SwordMan extends Hero {
	
	public SwordMan() {
		super();
	}
	
	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
	}
	
	public void attack() {
		System.out.println("揮劍");
	}
	
}
