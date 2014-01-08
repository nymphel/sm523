package tr.edu.metu.ii.sm.dp.student;

//Concrete State
public class HasCourseStudentState extends StudentState {

	@Override
	public void addCourse(StudentContext studentContext, Course c) {
		this.getCourses().add(c);
		System.out.println("course added: "+c.getCourseName());
	}

	@Override
	public void dropCourse(StudentContext studentContext, Course c) {
		if(this.getCourses().isEmpty()) {
			System.out.println("cannot drop course, course list is empty");
			return;
		}
		
		this.getCourses().remove(c);
		System.out.println("course removed: "+c.getCourseName());
		
		//if there is no course at all
		if(this.getCourses().isEmpty()) {
			studentContext.setStudentState(new InitialStudentState());
		}

	}

	@Override
	public void approveRegistration(StudentContext studentContext) {
		System.out.println("Registration approved.");
		studentContext.setStudentState(new ApprovedStudentState());
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
