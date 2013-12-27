package tr.edu.metu.ii.sm.dp.exception;

public class SqlServerRecorder extends Recorder {

	public SqlServerRecorder(Recorder successor) {
		this.setSuccessor(successor);
	}
	

	@Override
	public void record(String text) {
		if(isAvailable()) {
			System.out.println("SqlServerRecorder is recording text...");
		} else {
			System.out.println("SqlServerRecorder is unable to record text...");
			super.record(text);
		}
	}


	@Override
	public boolean isAvailable() {
		return (Environment.SQL_SERVER_SET && Environment.SQL_SERVER_WRITE_PERMISSION) ? true : false;
	}

}
