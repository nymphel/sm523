package tr.edu.metu.sm.dp.printspooler;

public class ColorPrintJob extends PrintJob {

	@Override
	public Printer getPrinter() {
		System.out.println("ColorPrintJob gets ColorPrinter");
		return new ColorPrinter();
	}

}
