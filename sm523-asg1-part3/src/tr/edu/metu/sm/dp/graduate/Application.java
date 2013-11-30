package tr.edu.metu.sm.dp.graduate;

import java.util.List;

import tr.edu.metu.sm.dp.graduate.domain.CourseInfo;
import tr.edu.metu.sm.dp.graduate.domain.PaperInfo;

public class Application {

	public static void main(String[] args) {
		Factory factory = new FactoryPhd();

		Course produceCourse = factory.produceCourse();

		boolean passedAllCourses = produceCourse.isPassedAllCourses();
		System.out.println("passedAllCourses::" + passedAllCourses);

		List<CourseInfo> showCoursesPassed = produceCourse.showCoursesPassed();
		if (showCoursesPassed != null && !showCoursesPassed.isEmpty()) {
			for (CourseInfo courseInfo : showCoursesPassed) {
				System.out.println("courseInfo::" + courseInfo);
			}
		} else {
			System.out.println("showCoursesPassed is empty!");
		}

		String showAvgDegree = produceCourse.showAvgDegree();
		System.out.println("showAvgDegree::" + showAvgDegree);

		Paper producePaper = factory.producePaper();
		boolean successfulPaper = producePaper.isSuccessfulPaper();

		System.out.println("successfulPaper::" + successfulPaper);
		List<PaperInfo> showPapers = producePaper.showPapers();
		if (showPapers != null && !showPapers.isEmpty()) {
			for (PaperInfo paperInfo : showPapers) {
				System.out.println("paperInfo::" + paperInfo);
			}
		} else {
			System.out.println("showPapers is empty!");
		}

		Earning produceEarning = factory.produceEarning();
		String showEarning = produceEarning.showEarning();
		System.out.println("showEarning::" + showEarning);

	}

}
