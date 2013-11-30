package tr.edu.metu.sm.dp.printspooler;


public abstract class PrintJob {
	
	public abstract Printer getPrinter();
	
	private Document document;

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public void sendToPrinter() {
		getPrinter().print(this);
	}
}
