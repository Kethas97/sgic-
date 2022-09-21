
public class results {
	private String StudentID;
	private String Grade;
	private String SubjectName;
	private String ExamTerm;
	private String Marks;
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public String getExamTerm() {
		return ExamTerm;
	}
	public void setExamTerm(String examTerm) {
		ExamTerm = examTerm;
	}
	public String getMarks() {
		return Marks;
	}
	public void setMarks(String marks) {
		Marks = marks;
	}
	public results(String studentID, String grade, String subjectName, String examTerm, String marks) {
		super();
		StudentID = studentID;
		Grade = grade;
		SubjectName = subjectName;
		ExamTerm = examTerm;
		Marks = marks;
	}
	public results() {
		super();
	}
	
	
}