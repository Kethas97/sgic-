
public class user {

	private String username;
	private String firstname;
	private String lastname;
	private String nicno;
	private String address ;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNicno() {
		return nicno;
	}
	public void setNicno(String nicno) {
		this.nicno = nicno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public user(String username, String firstname, String lastname, String nicno, String address) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nicno = nicno;
		this.address = address;
	}
	public user() {
		super();
	}
	@Override
	public String toString() {
		return "user [username=" + username + ", firstname=" + firstname + ", lastname=" + lastname + ", nicno=" + nicno
				+ ", address=" + address + "]";
	}
	
	
}
