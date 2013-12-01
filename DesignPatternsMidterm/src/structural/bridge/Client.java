package structural.bridge;

import structural.bridge.implementor.BigEngine;
import structural.bridge.implementor.SmallEngine;

public class Client {

	public static void main(String[] args) {

		Vehicle vehicle = new BigBus(new SmallEngine());
		vehicle.drive();
		vehicle.setEngine(new BigEngine());
		vehicle.drive();

		vehicle = new SmallCar(new SmallEngine());
		vehicle.drive();
		vehicle.setEngine(new BigEngine());
		vehicle.drive();

	}

}
