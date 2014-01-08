package tr.edu.metu.ii.sm.dp.student;

public class Course {

	private String courseName;
	private LetterGrade letterGrade;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public LetterGrade getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(LetterGrade letterGrade) {
		this.letterGrade = letterGrade;
	}

}
