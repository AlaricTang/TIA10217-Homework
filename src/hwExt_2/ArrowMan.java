package hwExt_2;

public class ArrowMan extends Hero{
	
	public ArrowMan() {
		super();
		this.attack = new AttackWithArrow();
		this.move = new Run();
		this.defend = new Defend();
	}
	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp);
		this.attack = new AttackWithArrow();
		this.move = new Run();
		this.defend = new Defend();
	}
}
