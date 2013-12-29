package tr.edu.metu.ceng;

import java.util.Random;

public class Monster extends Enemy {

	@Override
	public int getDamage() {
		Integer[] effect = {2,-2};
		int idx = new Random().nextInt(effect.length);
		int roll = (effect[idx]);
		return super.getDamage() + roll;
	}
	
	

}
