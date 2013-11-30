package tr.edu.metu.sm.dp.printspooler;

public class Application {

	public static void main(String[] args) {
		
		Document document = new PdfDocument();
		PrintJob printJob = new BlackWhitePrintJob();
		
		PrintSpooler.getInstance().sendToPrinter(document, printJob);

	}

}
