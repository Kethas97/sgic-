

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student
 */
@WebServlet("/Student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Connection con;
    PreparedStatement pst;
    int row;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse rsp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/StudentDetails","root","root");
            String StudentID = req.getParameter("StudentID");
            String Firstname = req.getParameter("Firstname");
            String Lastname= req.getParameter("Lastname");
            String Address= req.getParameter("Address");
            String Gender= req.getParameter("Gender");
            String Grade= req.getParameter("Grade");
            
            pst = con.prepareStatement("insert into Students(StudentID,Firstname,Lastname,Address,Gender,Grade)values(?,?,?,?,?,?) ");
            pst.setString(1, StudentID);
            pst.setString(2, Firstname);
            pst.setString(3, Lastname);
            pst.setString(4, Address);
            pst.setString(5, Gender);
            pst.setString(6, Grade);
            row = pst.executeUpdate();
            
            out.println("<font color='green'>  Record Addedddd   </font><br><br>");
            out.println("<td>"  + "<a href='ViewStudent'> View Student </a>" + "</td>");
            out.println("<td>"  + "<a href='home.jsp'> Home</a>" + "</td>");
            
        } catch (SQLException ex) {
          
             out.println("<font color='red'>  Record Failed   </font>");
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
    }
	
	
}

