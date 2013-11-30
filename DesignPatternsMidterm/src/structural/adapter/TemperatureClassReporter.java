package structural.adapter;

public class TemperatureClassReporter extends CelciusReporter implements TemperatureInfo {

	@Override
	public double getTemperatureInC() {
		return super.reportCelcius();
	}

	
}