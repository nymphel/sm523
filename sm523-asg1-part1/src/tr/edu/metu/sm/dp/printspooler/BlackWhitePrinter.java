package tr.edu.metu.sm.dp.printspooler;

public class BlackWhitePrinter implements Printer {

	@Override
	public void print(PrintJob printJob) {
		System.out.println("BlackWhitePrinter is printing");
		System.out.println("Document type is "+printJob.getDocument().getType());

	}

}
