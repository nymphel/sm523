package creational.builder;

/** director */
public class Waiter {

	private StarbucksBuilder starbucksBuilder;

	public void setStarbucksBuilder(StarbucksBuilder builder) {
		starbucksBuilder = builder;
	}

	public void constructStarbucks() {
		starbucksBuilder.createStarbucks();
		starbucksBuilder.buildDrink();
		starbucksBuilder.buildSize();
	}

}
