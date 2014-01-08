package tr.edu.metu.ii.sm.dp.student;

public class InitialStudentState extends StudentState {

	@Override
	public void addCourse(StudentContext studentContext, Course c) {
		System.out.println("Adding course...");
		studentContext.setStudentState(new HasCourseStudentState());
	}

	@Override
	public void dropCourse(StudentContext studentContext, Course c) {
		System.out.println("not possible");

	}

	@Override
	public void approveRegistration(StudentContext studentContext) {
		System.out.println("not possible");

	}

	@Override
	public void setGrade(StudentContext studentContext, Course c, LetterGrade l) {
		System.out.println("not possible");

	}

	@Override
	public void showGrades(StudentContext studentContext) {
		System.out.println("not possible");

	}

}
