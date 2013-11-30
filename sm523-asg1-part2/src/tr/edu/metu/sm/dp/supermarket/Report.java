package tr.edu.metu.sm.dp.supermarket;

import java.util.List;

public interface Report {
	
	public void generateAndBuildReport(List<SalesRecord> records);

}
