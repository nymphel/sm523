package tr.edu.metu.ii.sm.dp.exception;

public class Client {

	public static void main(String[] args) {
		
		Recorder textFileRecorder = new TextFileRecorder(null);
		Recorder eventLogRecorder = new EventLogRecorder(textFileRecorder);
		Recorder sqlServerRecorder = new SqlServerRecorder(eventLogRecorder);
		
		sqlServerRecorder.record("an exception is thrown at line...");
	
	}

}
