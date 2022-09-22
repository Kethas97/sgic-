

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class uploadServlet
 */
@WebServlet("/uploadServlet")
@MultipartConfig
public class uploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
    PreparedStatement pst;
    int row;
   
    
	protected void doPost(HttpServletRequest req, HttpServletResponse rsp) throws ServletException, IOException {
		
		rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/StudentDetails","root","root");
            
            String StudentID = req.getParameter("StudentID");
            
            Part filePart = req.getPart("photo");
            InputStream img = filePart.getInputStream();
            
            out.println(filePart.getName());
       
        
            pst = con.prepareStatement("INSERT INTO profile (StudentID, img) values (?, ?) ");
            pst.setString(1, StudentID);
            pst.setBlob(2, img);
            row = pst.executeUpdate();
            
            out.println("<font color='green'>  Added success   </font><br><br>");
            out.println("<td>"  + "<a href='ViewStudent'> View Student </a>" + "</td> <br><br>");
            out.println("<td>"  + "<a href='home.jsp'> Home</a>" + "</td>");
        }
        catch (SQLException ex) {
            
            out.println("<font color='red'>  Failed   </font>");
       } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}