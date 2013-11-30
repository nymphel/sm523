package tr.edu.metu.sm.dp.supermarket;

import java.util.Date;
import java.util.List;

public class MigrosSalesRecordBuilder implements SalesRecordBuilder {

	@Override
	public List<SalesRecord> readRecords(Date start, Date end) {
		System.out.println("readRecords as MigrosSalesRecordBuilder");
		return null;
	}

}
