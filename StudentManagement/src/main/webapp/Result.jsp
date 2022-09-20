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

<table>
<tr>
<td>StudentID</td>
<td><input type="text" name="StudentID" id="StudentID">
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
                
                
                <tr><td>SubjectName</td>
                 <td> <select>
                <option value="S001">Tamil</option>
                 <option value="S002">Maths</option>
                  <option value="S003">English</option>
                   <option value="S004">Science</option>
                    <option value="S005">History</option>
                     <option value="S006">ICT</option>
                      <option value="S007">PT</option>
                       <option value="S008">Religion</option>
                </select>
                </td></tr>
                 <tr><td>SubjectID</td>
                 <td> <select>
                <option value="Tamil">S001</option>
                 <option value="Maths">S002</option>
                  <option value="English">S003</option>
                   <option value="Science">S004</option>
                    <option value="History">S005</option>
                     <option value="ICT">S006</option>
                      <option value="PT">S007</option>
                       <option value="Religion">S008</option>
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
</body>
</html>