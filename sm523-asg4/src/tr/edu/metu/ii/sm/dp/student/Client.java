package tr.edu.metu.ii.sm.dp.student;

//Client
public class Client {

	public static void main(String[] args) {
		StudentContext studentContext = new StudentContext();
		studentContext.setStudentState(new InitialStudentState());
		
		studentContext.showTranscript();
		
		//studentContext.dropCourse(new Course("SM523"));
		
		studentContext.addCourse(new Course("SM523"));
		studentContext.addCourse(new Course("SM503"));

		studentContext.approveRegistration();
		
		studentContext.setGrade(new Course("SM523"), new LetterGrade("AA"));
		studentContext.setGrade(new Course("SM503"), new LetterGrade("BB"));
		
		studentContext.showGrades();
		
		studentContext.showTranscript();
		
	}

}
