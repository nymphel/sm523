package tr.edu.metu.ceng;

public abstract class Enemy extends Entity {

	private int damage;

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	@Override
	public void hit() {
		int dmg = getDamage();
		int opponentHealth = getOpponent().getHealth();
		opponentHealth -= dmg;
		getOpponent().setHealth(opponentHealth);
		
	}

}
