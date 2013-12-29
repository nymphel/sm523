package tr.edu.metu.ceng;

public class Game {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.setHealth(300);
		
		Punch punch = new Punch();
		punch.setDamage(3);
		hero.setWeapon(punch);
		
		Monster monster = new Monster();
		monster.setDamage(7);
		monster.setHealth(15);
		
		System.out.println("hero: " +hero.getHealth());
		System.out.println("enemy: " +monster.getHealth());
		
		hero.setOpponent(monster);
		hero.hit();
		monster.setOpponent(hero);
		monster.hit();
		
		System.out.println("hero: " +hero.getHealth());
		System.out.println("enemy: " +monster.getHealth());

	}

}
