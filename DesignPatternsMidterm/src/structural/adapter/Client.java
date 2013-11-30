package structural.adapter;

public class Client {

	public static void main(String[] args) {

		// class adapter
		System.out.println("class adapter test");
		TemperatureInfo tempInfo = new TemperatureClassReporter();
		System.out.println(tempInfo.getTemperatureInC());

		// object adapter
		System.out.println("\nobject adapter test");
		tempInfo = new TemperatureObjectReporter();
		System.out.println(tempInfo.getTemperatureInC());

	}

}
