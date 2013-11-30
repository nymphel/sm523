package tr.edu.metu.sm.dp.printspooler;

public class PrintSpooler {
	private static PrintSpooler instance = null;

	private PrintSpooler() {
	}

	public static PrintSpooler getInstance() {
		if (instance == null) {
			instance = new PrintSpooler();
		}

		return instance;
	}
	
	public void sendToPrinter(Document document, PrintJob printJob) {
		printJob.setDocument(document);
		printJob.sendToPrinter();
	}
}