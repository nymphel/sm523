package tr.edu.metu.sm.dp.printspooler;

public class BlackWhitePrintJob extends PrintJob {

	@Override
	public Printer getPrinter() {
		System.out.println("BlackWhitePrintJob gets BlackWhitePrinter");
		return new BlackWhitePrinter();
	}

}
