package tr.edu.metu.ceng;

public abstract class Entity {

	private int health;
	private Entity opponent;
	
	public abstract void hit();

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	

	public Entity getOpponent() {
		return opponent;
	}

	public void setOpponent(Entity opponent) {
		this.opponent = opponent;
	}

}
