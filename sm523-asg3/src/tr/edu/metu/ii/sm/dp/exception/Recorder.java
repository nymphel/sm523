package tr.edu.metu.ii.sm.dp.exception;

public abstract class Recorder {
	
	private Recorder successor;
	
	public void record(String text) {
		if(successor != null) {
			successor.record(text);
		} else {
			System.out.println("unable to find correct logger");
		}
	}
	
	public abstract boolean isAvailable();

	public Recorder getSuccessor() {
		return successor;
	}

	public void setSuccessor(Recorder successor) {
		this.successor = successor;
	}

}
