package tr.edu.metu.ii.sm.dp.student;

//Concrete State
public class TermCompletedStudentState extends StudentState {

	@Override
	public void addCourse(StudentContext studentContext, Course c) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Term is over, you cannot add course");

	}

	@Override
	public void dropCourse(StudentContext studentContext, Course c) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Term is over, you cannot drop course");

	}

	@Override
	public void approveRegistration(StudentContext studentContext) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Term is over, you can approve registration only once per term");

	}

	@Override
	public void setGrade(StudentContext studentContext, Course c, LetterGrade l) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Term is over, you cannot set grades");

	}

	@Override
	public void showGrades(StudentContext studentContext) throws UnsupportedOperationException {
		System.out.println("Showing grades of this term: ");
		printGrades();

	}

	private void printGrades() {
		for(Course c : this.getCourses()) {
			System.out.println(c.getCourseName()+" -> "+c.getLetterGrade().getGrade());
		}
	}

	@Override
	public void showTranscript() {
		// TODO Auto-generated method stub
		super.showTranscript();
		printGrades();
	}
	
	

}
