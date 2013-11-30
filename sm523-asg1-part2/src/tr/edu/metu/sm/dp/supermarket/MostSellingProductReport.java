package tr.edu.metu.sm.dp.supermarket;

import java.util.List;

public class MostSellingProductReport implements Report {

	@Override
	public void generateAndBuildReport(List<SalesRecord> records) {
		System.out.println("generateAndBuildReport for SummaryReport");
		
	}

}
