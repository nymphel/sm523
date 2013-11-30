package structural.adapter;

public class TemperatureObjectReporter implements TemperatureInfo {
	
	private CelciusReporter celciusReporter;

	public TemperatureObjectReporter() {
		celciusReporter = new CelciusReporter();
	}

	@Override
	public double getTemperatureInC() {
		return celciusReporter.reportCelcius();
	}

}
