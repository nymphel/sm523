package tr.edu.metu.ii.sm.dp.student;

public abstract class StudentState {

	public abstract void addCourse(StudentContext studentContext, Course c);
	public abstract void dropCourse(StudentContext studentContext, Course c);
	public abstract void approveRegistration(StudentContext studentContext);
	public abstract void setGrade(StudentContext studentContext, Course c, LetterGrade l);
	public abstract void showGrades(StudentContext studentContext);
	
	public void showTranscript() {
		System.out.println("Showing transcript...");
	}
	
}
