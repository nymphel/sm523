package tr.edu.metu.sm.dp.supermarket;

public class Application {

	public static void main(String[] args) {
		ReportGenerator reportGenerator = ReportGenerator.getInstance();
		reportGenerator.setReport(new SummaryReport());
		reportGenerator.setSalesRecordBuilder(new MigrosSalesRecordBuilder());
		reportGenerator.constructReport();

	}

}
