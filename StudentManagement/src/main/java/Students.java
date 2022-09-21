
public class Students {
	private String StudentID;
	private String Firstname;
	private String Lastname;
	private String Address;
	private String Gender;
	private String Grade;

	public Students() {
		super();
	}
	public Students(String studentID, String firstname, String lastname, String address, String gender, String grade) {
		super();
		StudentID = studentID;
		Firstname = firstname;
		Lastname = lastname;
		Address = address;
		Gender = gender;
		Grade = grade;
	}
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	
}
