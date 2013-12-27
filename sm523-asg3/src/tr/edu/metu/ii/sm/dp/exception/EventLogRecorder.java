package tr.edu.metu.ii.sm.dp.exception;

public class EventLogRecorder extends Recorder {

	public EventLogRecorder(Recorder successor) {
		this.setSuccessor(successor);
	}
	

	@Override
	public void record(String text) {
		if(isAvailable()) {
			System.out.println("EventLogRecorder is recording text...");
		} else {
			System.out.println("EventLogRecorder is unable to record text...");
			super.record(text);
		}
	}



	@Override
	public boolean isAvailable() {
		return Environment.EVENT_LOG_WRITE_PERMISSION ? true : false;
	}

}
