package tr.edu.metu.ii.sm.dp.student;

//Concrete State
public class ApprovedStudentState extends StudentState {

	@Override
	public void addCourse(StudentContext studentContext, Course c) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("You cannot add course for approved student");

	}

	@Override
	public void dropCourse(StudentContext studentContext, Course c) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("You cannot drop course for approved student");

	}

	@Override
	public void approveRegistration(StudentContext studentContext) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("You can approve registration only once per term");

	}

	@Override
	public void setGrade(StudentContext studentContext, Course c, LetterGrade l) throws UnsupportedOperationException {
		for (Course course : this.getCourses()) {
			if(course.getCourseName().equals(c.getCourseName())) {
				course.setLetterGrade(l);
				System.out.println("Setting grade "+l.getGrade()+" for course named "+c.getCourseName());
				break;
			}
		}
		
		// all grades will be set
		for (Course course : this.getCourses()) {
			if(course.getLetterGrade() == null) {
				return;
			}
		}
		studentContext.setStudentState(new TermCompletedStudentState());

	}

	@Override
	public void showGrades(StudentContext studentContext) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("You cannot show grades unless all grades are set.");

	}

}
