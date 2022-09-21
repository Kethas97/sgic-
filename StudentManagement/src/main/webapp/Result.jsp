<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="AddResults">

<table width="300px" border="1" >
                <tr>
                    <td colspan="2"><h1>Student Results</h1> </td>
                    
                </tr>
<tr>
<td>StudentID</td>
<td><input type="text" name="StudentID" id="StudentID">
</tr>
<tr>
             <td>Grade</td>
                    <td>
                <select name="Grade" id="Grade">
  				<option value="1"> 1</option>
  				<option value="2"> 2</option>
  				<option value="3"> 3</option>
  				<option value="4"> 4</option>
  				<option value="5"> 5</option>
  				<option value="6"> 6</option>
  				<option value="7"> 7</option>
  				<option value="8"> 8</option>
  				<option value="9"> 9</option>
  				<option value="10"> 10</option>
  				<option value="11"> 11</option>
  				<option value="12"> 12</option>
  
				</select> 
				</td>
                </tr>
                
                
                <tr><td>SubjectName</td>
                 <td> <select name="SubjectName">
                <option value="Tamil">Tamil</option>
                 <option value="Maths">Maths</option>
                  <option value="English">English</option>
                   <option value="Science">Science</option>
                    <option value="History">History</option>
                     <option value="ICT">ICT</option>
                      <option value="PT">PT</option>
                       <option value="Religion">Religion</option>
                </select>
                </td></tr>
                
                
                 <tr><td>ExamTerm</td>
                 <td> <select name="ExamTerm">
                <option value="1">Term1</option>
                 <option value="2">Term2</option>
                  <option value="3">Term3</option>
                  
                </select>
                </td></tr>
              
                
                
                
<tr>
<td>Marks</td>
<td><input type="text" name="Marks" id="Marks">
</tr>
<tr>
  <td> <input type="submit" value="submit"></td>
    </tr>
              
</table></form>

<p><a href="ViewResults">View Results</a></p>
 <p><a href="home.jsp"> Home</a></p>
</body>
</html>