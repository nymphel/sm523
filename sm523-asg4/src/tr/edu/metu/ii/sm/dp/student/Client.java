package tr.edu.metu.ii.sm.dp.student;

public class Client {

	public static void main(String[] args) {
		StudentContext studentContext = new StudentContext();
		studentContext.setStudentState(new InitialStudentState());
		
		studentContext.showTranscript();
		studentContext.addCourse(new Course());
		studentContext.setGrade(new Course(), new LetterGrade());
	}

}
