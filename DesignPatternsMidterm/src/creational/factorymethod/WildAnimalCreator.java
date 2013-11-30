package creational.factorymethod;

public class WildAnimalCreator implements AnimalCreator {

	public Animal createAnimal() {
		// TODO Auto-generated method stub
		return new WildAnimal();
	}

}
