package tr.edu.metu.ii.sm.dp.student;

public class HasCourseStudentState extends StudentState {

	@Override
	public void addCourse(StudentContext studentContext, Course c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dropCourse(StudentContext studentContext, Course c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void approveRegistration(StudentContext studentContext) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setGrade(StudentContext studentContext, Course c, LetterGrade l) {

		System.out.println("student has not approved yet!");

	}

	@Override
	public void showGrades(StudentContext studentContext) {
		// TODO Auto-generated method stub

	}

}
