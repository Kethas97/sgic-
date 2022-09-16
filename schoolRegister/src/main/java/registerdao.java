import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class registerdao {

	private String driver= "com.mysql.cj.jdbc.Driver";
	private String url= "jdbc:mysql://localhost:3306/studentdb";
	private String username="root";
	private String password="root";
	
	String sql=("insert into student values(?,?,?,?,?,?)");
	String sql1=("select FirstName,LastName,address,studentid,gender,grade from student where studentid=?");
	String sql2=("select * from student");
	String sql3=("delete from student where studentid=?");
	String sql4=("update stduent set FirstName=?,LastName=?,address=?,studentid=?,gender=?,grade=? where studentid=?");	
	

	
	public registerdao() {
	}



	protected Connection getConnection() {
		Connection con=null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	
	
	
	public void insertStudent(student student)throws SQLException {
		 System.out.println(sql);
		try {
			
			Connection con= getConnection();
			PreparedStatement st=con.prepareStatement(sql);
		st.setString(1,student.getFirstName());
		st.setString(2,student.getLastName());
		st.setString(3,student.getAddress());
		st.setString(4,student.getStudentid());
		st.setString(5,student.getGender()); 
		st.setString(6,student.getGrade()); 
		st.executeUpdate();
		}
		catch(SQLException e){
			printSQLException (e);
			
			}
		
		
	}
	public student selectStudent(String studentid) {
		student student=null;
		try{
			Connection con= getConnection();
			
			PreparedStatement st1=con.prepareStatement(sql1);
				st1.setString(1, studentid);
			System.out.println(st1);
			ResultSet rs=st1.executeQuery();
			
			while(rs.next()) 
			{	
			String FirstName=rs.getString("FirstName");
			String LastName=rs.getString("LastName");
			String address=rs.getString("address");
			String gender=rs.getString("gender");
			String grade=rs.getString("grade");
			student = new student(FirstName,LastName,address,studentid,gender,grade);
			}
		}
			
			
		catch(SQLException e){
			e.printStackTrace();
			
			}
		return student;
	}
	
	



public List<student> selectAllStudents() {
	List<student> students=new ArrayList<>();
		
		try{
			Connection con= getConnection();
			PreparedStatement st2=con.prepareStatement(sql2);
				
			System.out.println(st2);
			ResultSet rs=st2.executeQuery();
			while(rs.next()) {
				
			String FirstName=rs.getString("FirstName");
			String LastName=rs.getString("LastName");
			String address=rs.getString("address");
			String studentid=rs.getString("studentid");
			String gender=rs.getString("gender");
			String grade=rs.getString("grade");
			students.add(new student(FirstName,LastName,address,studentid,gender,grade));
			}
		}
			
			
		catch(SQLException e){
			e.printStackTrace();
			
			}
		return students;
			
	}
	

public boolean updateStudent(student student)throws SQLException{
	boolean rowUpdated = false;
	try 	
		(Connection con= getConnection();
		PreparedStatement st=con.prepareStatement(sql4);){
		System.out.println("update student"+st);
	st.setString(1,student.getFirstName());
	st.setString(2,student.getLastName());
	st.setString(3,student.getAddress());
	st.setString(4,student.getStudentid());
	st.setString(5,student.getGender()); 
	st.setString(6,student.getGrade()); 
	rowUpdated=st.executeUpdate()>0;
	}
	catch(SQLException e){
		printSQLException (e);
		
		}
	return rowUpdated;
}

public boolean deleteStudent(String studentid)throws SQLException{
	boolean rowdeleted;
	try 
		(Connection con= getConnection();
		PreparedStatement st=con.prepareStatement(sql3);){
		st.setString(1, studentid);
		rowdeleted=st.executeUpdate()>0;
	}
	return rowdeleted;
	}
private void printSQLException(SQLException e) {
	// TODO Auto-generated method stub
	
}
	
}