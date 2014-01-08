package tr.edu.metu.ii.sm.dp.student;

//Concrete State
public class InitialStudentState extends StudentState {

	@Override
	public void addCourse(StudentContext studentContext, Course c) {
		this.getCourses().add(c);
		studentContext.setStudentState(new HasCourseStudentState());
		System.out.println("course added: "+c.getCourseName());
	}

	@Override
	public void dropCourse(StudentContext studentContext, Course c) {
		throw new UnsupportedOperationException("You cannot drop course unless you have not one");

	}

	@Override
	public void approveRegistration(StudentContext studentContext) {
		throw new UnsupportedOperationException("You cannot approve registration, student does not have any couses yet");

	}

	@Override
	public void setGrade(StudentContext studentContext, Course c, LetterGrade l) {
		throw new UnsupportedOperationException("You cannot set grades, student does not approved yet");

	}

	@Override
	public void showGrades(StudentContext studentContext) {
		throw new UnsupportedOperationException("You cannot show grades unless all grades are set.");

	}

}
