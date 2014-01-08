package tr.edu.metu.ii.sm.dp.shopping;

import java.util.List;

public class ReportContext implements ReportStrategy {
	
	private ReportStrategy reportStrategy;

	@Override
	public void showReport(List<Product> products) {
		reportStrategy.showReport(products);
		System.out.println("\n");
		
	}

	public ReportStrategy getReportStrategy() {
		return reportStrategy;
	}

	public void setReportStrategy(ReportStrategy reportStrategy) {
		this.reportStrategy = reportStrategy;
	}

}
