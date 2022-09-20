

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditReturn
 */
@WebServlet("/EditReturn")
public class EditReturn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int row; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditReturn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse rsp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  rsp.setContentType("text/html");
	        PrintWriter out = rsp.getWriter();
	        
	        String StudentID = req.getParameter("StudentID");
	        
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost/StudentDetails","root","root");
	          
	           pst = con.prepareStatement("select * from Students where StudentID = ?");
	           pst.setString(1, StudentID);
	           rs = pst.executeQuery();
	          
	           while(rs.next())
	           {
	               out.print("<form action='Edit' method='POST'");
	                out.print("<table");
	              
	                 out.print("<tr> <td>StudentID</td>    <td> <input type='text' name ='StudentID' id='StudentID' </td> </tr>" + rs.getString("StudentID")+"<br><br>" );
	                 out.print("<br><tr> <td>Firstname</td>    <td> <input type='text' name ='Firstname' id='Firstname' </td> </tr>" + rs.getString("Firstname")+"<br><br>");
	                 out.print("<tr> <td>Lastname</td>    <td> <input type='text' name ='Lastname' id='Lastname' </td> </tr>" + rs.getString("Lastname")+"<br><br>" );
	                 out.print("<tr> <td>Address</td>    <td> <input type='text' name ='Address' id='Address' </td> </tr>" + rs.getString("Address")+"<br><br>");
	                 out.print("<tr> <td>Gender</td>    <td> <input type='radio' name='Gender' value='male' > Male <input type='radio' name='Gender' value='female' >Female </td> </tr>" + rs.getString("Gender")+"<br><br>");
	                 out.print("<tr> <td>Grade</td>    <td> <select name='Grade' id='Grade'> <option value='1'>Grade 1</option> <option value='2'>Grade 2 </option> <option value='3'>Grade 3 </option> <option value='4'>Grade 4 </option><option value='5'>Grade 5 </option> <option value='6'>Grade 6</option> <option value='7'>Grade 7 </option> <option value='8'>Grade 8 </option> <option value='9'>Grade 9 </option> <option value='10'>Grade 10 </option> <option value='11'>Grade 11 </option> <option value='12'>Grade 12 </option>  </td> </tr>" + rs.getString("Grade")+"<br><br>");
		             
	                 out.print("<tr>  <td colspan ='2'> <input type='submit'  value= 'Edit'/> </td> </tr><br><br>");
	               out.print("</table");
	              out.print("</form");
	              
	           }
	            
	        } catch (SQLException ex) {
	          
	             out.println("<font color='red'>  Record Failed   </font>");
	        } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
