package tr.edu.metu.sm.dp.printspooler;

public class ColorPrinter implements Printer {

	@Override
	public void print(PrintJob printJob) {
		System.out.println("ColorPrinter is printing");
		System.out.println("Document type is "+printJob.getDocument().getType());
	}

}
