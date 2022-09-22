

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Photo
 */
@WebServlet("/Photo")
public class Photo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
    
 
 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Photo() {
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
	          
	            String StudentID = req.getParameter("StudentID");
	            PreparedStatement ps = con.prepareStatement("select img from profile where StudentID=?");
	            ps.setString(1, StudentID);
	            ResultSet rs = ps.executeQuery();
	            Students  Students=null;
	            if(rs.next()){
	            	 Students = new Students();
	                
	                 Blob blob = rs.getBlob("img");
	                  
	                 InputStream inputStream = blob.getBinaryStream();
	                 ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	                 byte[] buffer = new byte[4096];
	                 int bytesRead = -1;
	                  
	                 while ((bytesRead = inputStream.read(buffer)) != -1) {
	                     outputStream.write(buffer, 0, bytesRead);                  
	                 }
	                  
	                 byte[] imageBytes = outputStream.toByteArray();
	                 String base64Image = Base64.getEncoder().encodeToString(imageBytes);
	                  
	                  
	                 inputStream.close();
	                 outputStream.close();
	                  
	                
	                 Students.setBase64Image(base64Image);
	                 
	                 out.println("<td>"  + "<a href='StudentPhoto.jsp'> View Student Photo </a>" + "</td>");
	                 
	                }
	            
	       
	            }
	            
	                catch (SQLException ex) {
	                    
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
