package tr.edu.metu.sm.dp.supermarket;

import java.util.Date;
import java.util.List;

public interface SalesRecordBuilder {
	
	public List<SalesRecord> readRecords(Date start, Date end);

}
