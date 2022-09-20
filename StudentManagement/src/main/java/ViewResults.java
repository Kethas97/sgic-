

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
 * Servlet implementation class ViewResults
 */
@WebServlet("/ViewResults")
public class ViewResults extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int row;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewResults() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse rsp) throws ServletException, IOException {
		rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/StudentDetails","root","root");
          
            String sql;
            
            sql = "select * from results";
            java.sql.Statement stmt = con.createStatement();
            rs =stmt.executeQuery(sql);
            
            out.println("<table cellspacing='0' width='350px' border='1'>");
            out.println("<tr>");
            out.println("<td> StudentID </td>");
            out.println("<td> Grade </td>");
            out.println("<td> SubjectName </td>");
            out.println("<td> SubjectID </td>");
            out.println("<td> Marks </td>");

            out.println("</tr>");
            
            while(rs.next())
            {
             out.println("<tr>");
             out.println("<td>"  + rs.getString("StudentID")   +  "</td>");
             out.println("<td>"  + rs.getString("Grade")   +  "</td>");
             out.println("<td>"  + rs.getString("SubjectName")   +  "</td>");  
             out.println("<td>"  + rs.getString("SubjectID")   +  "</td>");  
             out.println("<td>"  + rs.getString("Marks")   +  "</td>");  
             out.println("</tr>");
 
            }
            
            out.println("</table>");
            
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
