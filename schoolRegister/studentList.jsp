<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}} </div-->

		<div class="container">
			<h3 class="text-center">students list</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					New student</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>studentid</th>
						<th>FirstName</th>
						<th>LastName</th>
						<th>address</th>
						<th>gender</th>
						<th>grade</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="student" items="${liststudent}">

						<tr>
							<td><c:out value="${student.studentid}" /></td>
							<td><c:out value="${student.FirstName}" /></td>
							<td><c:out value="${student.LastName}" /></td>
							<td><c:out value="${student.address}" /></td>
							<td><c:out value="${student.gender}" /></td>
							<td><c:out value="${student.grade}" /></td>
							<td><a href="edit?studentid=<c:out value='${student.studentid}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?studentid=<c:out value='${student.studentid}' />">Delete</a></td>
						</tr>
					</c:forEach>
		
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>