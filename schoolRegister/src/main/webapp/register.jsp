<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div><form action="register" method="post">
<table>
<tr><td>FirstName</td><td><input type="text" name="FirstName"></td></tr>
<tr><td>LastName</td><td><input type="text" name="LastName"></td></tr>
<tr><td>Address</td><td><input type="text" name="address"></td></tr>
<tr><td>StudentId</td><td><input type="text" name="studentid"></td></tr>
<tr><td>gender</td><td><input type="radio" name="gender"  value="male"><label for="male">male</label>
<input type="radio" name="gender" value="female"><label for="female">female</label></td></tr>
<tr><td><label for="grade">Choose a grade:</label></td>
<td><select name="grade" id="grade">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
  <option value="7">7</option>
  <option value="8">8</option>
  <option value="9">9</option>
  <option value="10">10</option>
  <option value="11">11</option>
  </select></td></tr>

<tr><td>submit</td><td><input type=submit></td></tr>
</table></form></div>
</body>
</html>