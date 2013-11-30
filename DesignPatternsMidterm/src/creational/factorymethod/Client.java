package creational.factorymethod;

public final class Client {

	public static void main(String[] args) {
		
		AnimalCreator animalCreator = new WildAnimalCreator();
		animalCreator.createAnimal().hearVoice();
		
		animalCreator = new DomesticAnimalCreator();
		animalCreator.createAnimal().hearVoice();

	}

}
