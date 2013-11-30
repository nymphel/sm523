package tr.edu.metu.sm.dp.graduate;

public class FactoryMsWithThesis implements Factory {

	@Override
	public Course produceCourse() {
		return new CourseMsWithThesis();
	}

	@Override
	public Paper producePaper() {
		return new PaperMsWithThesis();
	}

	@Override
	public Earning produceEarning() {
		return new EarningMsWithThesis();
	}

}
