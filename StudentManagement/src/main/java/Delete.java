

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
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int row;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
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
	        
	        String sid = req.getParameter("id");
	        
	        
	        try {
	             Class.forName("com.mysql.cj.jdbc.Driver");
	             con = DriverManager.getConnection("jdbc:mysql://localhost/StudentDetails","root","root");
	             pst = con.prepareStatement("delete from Students where StudentID = ?");
	             pst = con.prepareStatement("delete from results where StudentID = ?");
	             pst.setString(1, sid);
	             pst.setString(1, sid);
	             row = pst.executeUpdate();
	            
	             out.println("<font color='green'>  Record Deletedddddd   </font><br><br>");
	             out.println("<td>"  + "<a href='ViewResults'> View Results </a>" + "</td><br><br>");
	             out.println("<td>"  + "<a href='home.jsp'> Home</a>" + "</td>");
	            
	 
	            
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
