package tr.edu.metu.sm.dp.graduate;

import java.util.List;

import tr.edu.metu.sm.dp.graduate.domain.CourseInfo;

public interface Course {
	
	public boolean isPassedAllCourses();
	public List<CourseInfo> showCoursesPassed();
	public String showAvgDegree(); 

}
