import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DBC {
	Connection con=null;
	Statement st=null;
	
	public  DBC() {
	
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/reg","root","root");
			System.out.println("success");
			st=(Statement) con.createStatement();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void loadDriver(String driver) {
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void insertuser(List<user> list)throws SQLException {
		
		try {
			for(user usr:list) {
			
					String sql="insert into user (username,firstname,lastname,nicno,address)"+"values('"+usr.getUsername()+"','"+usr.getFirstname()+"','"+usr.getLastname()+"','"+usr.getNicno()+"','"+usr.getAddress()+"')";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.execute();
			
			
				}
		}
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		finally {
			try {
				if(st!=null) {
					con.close();
				}
				}
				catch(SQLException se) {
					System.out.println(se.getMessage());
					
				}
			
			}
				
			}
	}
