package tr.edu.metu.ii.sm.dp.exception;

/** concrete handler */
public class TextFileRecorder extends Recorder {

	public TextFileRecorder(Recorder successor) {
		this.setSuccessor(successor);
	}

	@Override
	public void record(String text) {
		if (isAvailable()) {
			System.out.println("TextFileRecorder is recording text...");
		} else {
			System.out.println("TextFileRecorder is unable to record text...");
			super.record(text);
		}
	}

	@Override
	public boolean isAvailable() {
		return true;
	}

}
