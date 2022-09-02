package db;

import java.sql.*;

class jdbc{  
	
public static void main(String args[]){ 
	
try{ 
	
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sgic","root","");  

Statement stmt=con.createStatement();

//stmt.executeUpdate("insert into std values(01,'kamal',001,'batti')");

//stmt.executeUpdate("update std set sage=22 where sno=01");
ResultSet rs=stmt.executeQuery("select * from std"); 

while(rs.next())
	
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getInt(3)+"  "+rs.getString(4));  
con.close(); 

}

catch(Exception e){
	System.out.println(e);
	}  
}  
}  