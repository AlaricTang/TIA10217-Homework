package hwExt_2;

public abstract class Hero {
	// 省略 getter/setter...
	private String name;
	private int level;
	private double exp;
	
	protected IAttack attack;
	protected IMove move;
	protected IDefend defend;

	public Hero() {
		this("David", 1, 0);
	}
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	protected void attack() {
		attack.attack();
	}
	protected void defend() {
		defend.defend();
	}
	protected void move() {
		move.move();
	}
	
//	public void setAttack(IAttack attackBehavior) {
//		this.attack = attackBehavior;
//	}
//	public void setMove(IMove moveBehavior) {
//		this.move = moveBehavior;
//	}
//	public void setDefend(IDefend defendBehavior) {
//		this.defend = defendBehavior;
//	}
	
}
