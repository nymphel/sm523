package tr.edu.metu.ii.sm.dp.student;

import java.util.ArrayList;
import java.util.List;

//State
public abstract class StudentState {

	public abstract void addCourse(StudentContext studentContext, Course c) throws UnsupportedOperationException;
	public abstract void dropCourse(StudentContext studentContext, Course c) throws UnsupportedOperationException;
	public abstract void approveRegistration(StudentContext studentContext) throws UnsupportedOperationException;
	public abstract void setGrade(StudentContext studentContext, Course c, LetterGrade l) throws UnsupportedOperationException;
	public abstract void showGrades(StudentContext studentContext) throws UnsupportedOperationException;
	
	public void showTranscript() {
		System.out.println("Showing transcript...");
	}
	
	private List<Course> courses;
	
	public List<Course> getCourses() {
		if(courses == null) {
			courses = new ArrayList<>();
		}
		return courses;
	}
}
