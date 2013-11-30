package tr.edu.metu.sm.dp.supermarket;

import java.util.Date;
import java.util.List;

public class ReportGenerator {

	private static ReportGenerator instance = null;

	private ReportGenerator() {
	}

	public static ReportGenerator getInstance() {
		if (instance == null) {
			instance = new ReportGenerator();
		}

		return instance;
	}

	private SalesRecordBuilder salesRecordBuilder;
	private Date start;
	private Date end;

	private Report report;

	public void setSalesRecordBuilder(SalesRecordBuilder salesRecordBuilder) {
		this.salesRecordBuilder = salesRecordBuilder;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	public void constructReport() {
		List<SalesRecord> records = salesRecordBuilder.readRecords(start, end);
		report.generateAndBuildReport(records);

	}

}
