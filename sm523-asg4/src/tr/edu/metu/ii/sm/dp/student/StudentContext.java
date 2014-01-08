package tr.edu.metu.ii.sm.dp.student;

import java.util.List;

//Context 
public class StudentContext {

	private StudentState studentState;

	public void addCourse(Course c) {
		studentState.addCourse(this, c);
	}

	public void dropCourse(Course c) {
		studentState.dropCourse(this, c);
	}

	public void approveRegistration() {
		studentState.approveRegistration(this);
	}

	public void setGrade(Course c, LetterGrade l) {
		studentState.setGrade(this, c, l);
	}

	public void showGrades() {
		studentState.showGrades(this);
	}

	public void showTranscript() {
		studentState.showTranscript();
	}

	public StudentState getStudentState() {
		return studentState;
	}

	public void setStudentState(StudentState studentState) {
		System.out.println("::: Setting a new state: "+ studentState.getClass().getSimpleName());
		
		if (this.studentState != null) {
			List<Course> keptCourses = this.studentState.getCourses();
			studentState.getCourses().addAll(keptCourses);
		}
		this.studentState = studentState;
	}

}