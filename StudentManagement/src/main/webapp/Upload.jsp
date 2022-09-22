<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="uploadServlet" enctype="multipart/form-data">
            <table >
                <tr>
                    <td>StudentID </td>
                    <td><input type="text" name="StudentID" ></td>
                </tr>
                
                 <tr>
                    <td>Student Photo: </td>
                    <td><input type="file" name="photo" ></td>
                </tr>
                  <tr>
                    <td>
                        <input type="submit" value="Save">
                    </td>
                </tr>
            </table>
        </form>
</body>
</html>