
public class student {

	private String FirstName;
	private String LastName;
	private String address;
	private String studentid;
	private String gender;
	private String grade;
	
	
	public student() {
		super();
	}
	
	
	public student(String firstName,  String lastName,String address, String studentid,String gender, String grade) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.address = address;
		this.studentid = studentid;
		this.gender=gender;
		this.grade = grade;
	}
	
	
	


	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
