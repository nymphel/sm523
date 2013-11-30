package tr.edu.metu.sm.dp.graduate;

import java.util.List;

import tr.edu.metu.sm.dp.graduate.domain.CourseInfo;

public class CourseMsWithThesis implements Course {

	@Override
	public boolean isPassedAllCourses() {
		System.out.println("CourseMsWithThesis->isPassedAllCourses");
		return false;
	}

	@Override
	public List<CourseInfo> showCoursesPassed() {
		System.out.println("CourseMsWithThesis->showCoursesPassed");
		return null;
	}

	@Override
	public String showAvgDegree() {
		System.out.println("CourseMsWithThesis->showAvgDegree");
		return null;
	}
	
}
