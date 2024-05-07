package hwExt_2;

public class SwordMan extends Hero {
	
	public SwordMan() {
		super();
		this.attack = new AttackWithSword();
		this.move = new Run();
		this.defend = new Defend();
	}
	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
		this.attack = new AttackWithSword();
		this.move = new Run();
		this.defend = new Defend();
	}
}
