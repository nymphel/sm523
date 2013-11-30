package tr.edu.metu.sm.dp.supermarket;

import java.util.Date;
import java.util.List;

public class WegmansSalesRecordBuilder implements SalesRecordBuilder {

	@Override
	public List<SalesRecord> readRecords(Date start, Date end) {
		System.out.println("readRecords as WegmansSalesRecordBuilder");
		return null;
	}

	

}
