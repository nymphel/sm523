package tr.edu.metu.sm.dp.graduate;

public class FactoryPhd implements Factory {

	@Override
	public Course produceCourse() {
		return new CoursePhd();
	}

	@Override
	public Paper producePaper() {
		return new PaperPhd();
	}

	@Override
	public Earning produceEarning() {
		return new EarningPhd();
	}

}
