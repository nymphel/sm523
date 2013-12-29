package tr.edu.metu.ceng;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Entity {

	private Weapon weapon;
	private List<Enemy> enemiesKilled = new ArrayList<>();

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public List<Enemy> getEnemiesKilled() {
		return enemiesKilled;
	}

	@Override
	public void hit() {
		int dmg = getWeapon().getDamage();
		int opponentHealth = getOpponent().getHealth();
		opponentHealth -= dmg;
		getOpponent().setHealth(opponentHealth);
		
	}
	
	public void pickupWeapon(Weapon drop) {
		if(weapon.getDamage() <= drop.getDamage()) {
			System.out.println("Hero choses to pick up the new weapon.");
			this.weapon = drop;
		} else {
			System.out.println("Hero choses to preserve his weapon.");
		}
		System.out.println("\n");
	}

}
