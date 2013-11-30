package tr.edu.metu.sm.dp.graduate;

public class FactoryMsWithoutThesis implements Factory {

	@Override
	public Course produceCourse() {
		return new CourseMsWithoutThesis();
	}

	@Override
	public Paper producePaper() {
		return new PaperMsWithoutThesis();
	}

	@Override
	public Earning produceEarning() {
		return new EarningMsWithoutThesis();
	}

}
