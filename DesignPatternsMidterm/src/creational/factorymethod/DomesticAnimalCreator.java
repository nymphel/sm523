package creational.factorymethod;

public class DomesticAnimalCreator implements AnimalCreator {


	public Animal createAnimal() {
		return new DomesticAnimal();
	}

}
