<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form method="POST" action="Student">
            
            <table width="300px" border="1" >
                <tr>
                    <td colspan="2"><h1>Student Registation</h1> </td>
                    
                </tr>
 
                <tr>
                    <td>StudentID</td>
                    <td><input type="text" name="StudentID" id="StudentID"></td>
                </tr>
                
                <tr>
                    <td>Firstname</td>
                    <td><input type="text" name="Firstname" id="fname"></td>
                </tr>
                
                <tr>
                    <td>Lastname</td>
                    <td><input type="text" name="Lastname" id="lname"></td>
                </tr>
                
                 <tr>
                    <td>Address</td>
                    <td><input type="text" name="Address" id="Address"></td>
                </tr>
                
                 <tr>
                    <td>Gender</td>
                    <td> <input type="radio" name="Gender" value="male" >Male
 					<input type="radio" name="Gender"  value="female">Female</td>
                </tr>
                
                <tr>
                    <td>Grade</td>
                    <td>
                <select name="Grade" id="Grade">
  				<option value="1">Grade 1</option>
  				<option value="2">Grade 2</option>
  				<option value="3">Grade 3</option>
  				<option value="4">Grade 4</option>
  				<option value="5">Grade 5</option>
  				<option value="6">Grade 6</option>
  				<option value="7">Grade 7</option>
  				<option value="8">Grade 8</option>
  				<option value="9">Grade 9</option>
  				<option value="10">Grade 10</option>
  				<option value="11">Grade 11</option>
  				<option value="12">Grade 12</option>
  
				</select> 
				</td>
                </tr>
                <tr>
                    <td colspan="2"> <input type="submit" value="submit"></td>
                
                </tr>
                
                
            </table>
            
        </form>
        
         <p><a href="Upload.jsp"> Insert Profile Photo</a></p>
         
        <p><a href="ViewStudent">View Student</a></p>
        
        <p><a href="home.jsp"> Home</a></p>
        
</body>
</html>