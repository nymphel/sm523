package tr.edu.metu.sm.dp.graduate;

import java.util.List;

import tr.edu.metu.sm.dp.graduate.domain.CourseInfo;

public class CourseMsWithoutThesis implements Course {

	@Override
	public boolean isPassedAllCourses() {
		System.out.println("CourseMsWithoutThesis->isPassedAllCourses");
		return false;
	}

	@Override
	public List<CourseInfo> showCoursesPassed() {
		System.out.println("CourseMsWithoutThesis->showCoursesPassed");
		return null;
	}

	@Override
	public String showAvgDegree() {
		System.out.println("CourseMsWithoutThesis->showAvgDegree");
		return null;
	}
	
}
