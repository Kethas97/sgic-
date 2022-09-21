import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentResults {

	 public int StudentResult(results rslt) throws ClassNotFoundException {
	        String SQL = "INSERT INTO results" +
	            "  (StudentID, Grade, SubjectName, ExamTerm, Marks) VALUES " +
	            " (?, ?, ?,?,?);";

	        int result = 0;

	        Class.forName("com.mysql.cj.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/studentdetails", "root", "root");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
	            preparedStatement.setString(1, rslt.getStudentID());
	            preparedStatement.setString(2, rslt.getGrade());
	            preparedStatement.setString(3, rslt.getSubjectName());
	            preparedStatement.setString(4, rslt.getExamTerm());
	            preparedStatement.setString(5, rslt.getMarks());
	          
	          

	            System.out.println(preparedStatement);
	            // Step 3: Execute the query or update query
	            result = preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            // process sql exception
	            printSQLException(e);
	        }
	        return result;
	    }

	private void printSQLException(SQLException e) {
		// TODO Auto-generated method stub
		
	}

}
