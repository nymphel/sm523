package tr.edu.metu.ceng;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Game {

	private static final String ADD_WEAPON = "AddWeapon";
	private static final String ADD_ENEMY = "AddEnemy";
	private static final String GUN = "Gun";
	private static final String SWORD = "Sword";
	private static final String PUNCH = "Punch";
	private static final String WEAPON = "Weapon";
	private static final String WOLF = "Wolf";
	private static final String MONSTER = "Monster";
	private static final String ENEMY = "Enemy";
	private static final String HERO = "Hero";

	public static void main(String[] args) throws IOException, CloneNotSupportedException {

		// define objects of game
		Hero hero = null;
		Monster monster = null;
		Wolf wolf = null;
		Weapon punch = null;
		Weapon sword = null;
		Weapon gun = null;

		// read from control.txt to setup entity & weapon attributes
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader("C:/control.txt"));
		for (String line; (line = br.readLine()) != null;) {
			if (line.startsWith("--")) {
				continue;
			}

			String[] split = line.split(" ");
			if (HERO.equals(split[0])) {
				hero = new Hero();
				hero.setHealth(Integer.parseInt(split[1]));
			} else if (ENEMY.equals(split[0])) {
				if (MONSTER.equals(split[1])) {
					monster = new Monster();
					monster.setHealth(Integer.parseInt(split[2]));
					monster.setDamage(Integer.parseInt(split[3]));
				} else if (WOLF.equals(split[1])) {
					wolf = new Wolf();
					wolf.setHealth(Integer.parseInt(split[2]));
					wolf.setDamage(Integer.parseInt(split[3]));
				}
			} else if (WEAPON.equals(split[0])) {
				if (PUNCH.equals(split[1])) {
					punch = new Punch();
					punch.setDamage(Integer.parseInt(split[2]));
				} else if (SWORD.equals(split[1])) {
					sword = new Sword();
					sword.setDamage(Integer.parseInt(split[2]));
				} else if (GUN.equals(split[1])) {
					gun = new Gun();
					gun.setDamage(Integer.parseInt(split[2]));
				}
			}
		}

		// set a weapon to hero (by default it is a punch)
		hero.setWeapon(punch);
		boolean heroDead = false;

		// start simulation
		br = new BufferedReader(new FileReader("C:/simulation.txt"));
		for (String line; (line = br.readLine()) != null;) {
			if (line.startsWith("--")) {
				continue;
			}
			String[] split = line.split(" ");
			if (ADD_ENEMY.equals(split[0])) {
				if (MONSTER.equals(split[1])) {
					heroDead = fight(hero, (Enemy) monster.clone());
				} else if (WOLF.equals(split[1])) {
					heroDead = fight(hero, (Enemy) wolf.clone());
				}
				if (heroDead) {
					System.out.println("Game Over. Hero Died.");
					break;
				}
			} else if (ADD_WEAPON.equals(split[0])) {
				if (PUNCH.equals(split[1])) {
					System.out.println("Hero finds a punch on the road.");
					hero.pickupWeapon(punch);
				} else if (SWORD.equals(split[1])) {
					System.out.println("Hero finds a sword on the road.");
					hero.pickupWeapon(sword);
				} else if (GUN.equals(split[1])) {
					System.out.println("Hero finds a gun on the road.");
					hero.pickupWeapon(gun);
				}
			}
		}

		if (!heroDead) {
			System.out.println("Game Over. All enemies are dead.");
		}
		
		//it varies because of monster's hit variation +2 -2
		System.out.println("Total number of enemies killed is " + hero.getEnemiesKilled().size());

	}

	private static boolean fight(Hero hero, Enemy enemy) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hero meets with an enemy in his road!");
		sb.append("\n");
		sb.append("Battle with ");
		sb.append(enemy.getClass().getSimpleName());
		sb.append(" (health: ");
		sb.append(enemy.getHealth());
		sb.append(", damage: ");
		sb.append(enemy.getDamage());
		sb.append(")");
		sb.append("\n");
		sb.append("Hero -> Healths: " + hero.getHealth() + " | Weapon type: class "
				+ hero.getWeapon().getClass().getSimpleName() + " | Weapon damage: " + hero.getWeapon().getDamage()
				+ "");

		System.out.println(sb.toString());

		// go on one of them is dead
		while (hero.getHealth() > 0 && enemy.getHealth() > 0) {
			hero.setOpponent(enemy);
			hero.hit();
			enemy.setOpponent(hero);
			enemy.hit();

			sb = new StringBuilder();
			sb.append(">>>>> Healths--> Hero: " + (hero.getHealth() > 0 ? hero.getHealth() : "DEAD") + " | class "
					+ enemy.getClass().getSimpleName() + ": " + (enemy.getHealth() > 0 ? enemy.getHealth() : "DEAD")
					+ "");
			System.out.println(sb.toString());
		}
		
		System.out.println("\n");

		// if our hero is dead, return true, then game is over
		if (hero.getHealth() < 0) {
			return true;
		}

		// add enemies killed
		hero.getEnemiesKilled().add(enemy);

		return false;

	}

}
