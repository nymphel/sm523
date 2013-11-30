package tr.edu.metu.sm.dp.supermarket;

import java.util.List;

public class SummaryReport implements Report {

	@Override
	public void generateAndBuildReport(List<SalesRecord> records) {
		System.out.println("generateAndBuildReport for SummaryReport");
		
	}

}
