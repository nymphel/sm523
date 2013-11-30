package tr.edu.metu.sm.dp.graduate;

import java.util.List;

import tr.edu.metu.sm.dp.graduate.domain.CourseInfo;

public class CoursePhd implements Course {

	@Override
	public boolean isPassedAllCourses() {
		System.out.println("CoursePhd->isPassedAllCourses");
		return false;
	}

	@Override
	public List<CourseInfo> showCoursesPassed() {
		System.out.println("CoursePhd->showCoursesPassed");
		return null;
	}

	@Override
	public String showAvgDegree() {
		System.out.println("CoursePhd->showAvgDegree");
		return null;
	}
	
}
