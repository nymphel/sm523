package creational.builder;

public class CoffeeBuilder extends StarbucksBuilder {
	
	public void buildSize() {
		starbucks.setSize("medium");
		System.out.println("build medium size");
	}

	public void buildDrink() {
		starbucks.setDrink("coffee");
		System.out.println("build coffee");
	}
}
