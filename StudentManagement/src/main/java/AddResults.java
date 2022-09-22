

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
 * Servlet implementation class AddResults
 */
@WebServlet("/AddResults")
public class AddResults extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 Connection con;
	    PreparedStatement pst;
	    int row; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddResults() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest req, HttpServletResponse rsp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");	
            con = DriverManager.getConnection("jdbc:mysql://localhost/studentdetails","root","root");
            String StudentID = req.getParameter("StudentID");
            String Grade = req.getParameter("Grade");
            String SubjectName= req.getParameter("SubjectName");
            String ExamTerm= req.getParameter("ExamTerm");
            String Marks= req.getParameter("Marks");
            
            pst = con.prepareStatement("insert into results(StudentID,Grade,SubjectName,ExamTerm,Marks)values(?,?,?,?,?) ");
            pst.setString(1, StudentID);
            pst.setString(2, Grade);
            pst.setString(3, SubjectName);
            pst.setString(4, ExamTerm);
            pst.setString(5, Marks);
            row = pst.executeUpdate();
         
            out.println("<font color='green'>  Record Addedddd   </font><br><br>");
            out.println("<td>"  + "<a href='ViewResults'> View Results </a>" + "</td><br><br>");
            out.println("<td>"  + "<a href='home.jsp'> Home</a>" + "</td>");
            
        } catch (SQLException ex) {
          
             out.println("<font color='red'>  Record Failed   </font>");
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
    }
}

}
