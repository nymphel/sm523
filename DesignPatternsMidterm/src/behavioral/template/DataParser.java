package behavioral.template;

abstract public class DataParser {

	// Template method
	// This method defines a generic structure for parsing data
	public void parseDataAndGenerateOutput() {
		readData();
		processData();
		writeData();
	}

	// This methods will be implemented by its subclass
	public abstract void readData();

	public abstract void processData();

	// We have to write output in a file so this step will be same for all
	// subclasses
	public void writeData() {
		System.out.println("Output generated, writing to file system");
	}
}