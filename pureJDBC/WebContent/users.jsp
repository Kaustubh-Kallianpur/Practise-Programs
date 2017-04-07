<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
<script src="resources/js/jquery-3.2.0.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
</head>
<body>
<c:if test="${!empty userList}">
	<c:forEach items="${userList}" var="user">
		<table class="table">
			<tr>
				<th>USERNAME</th>
				<th>NAME</th>
				<th>PHONE</th>
				<th>MAIL</th>
			</tr>
			
			<tr>
				<td>${user.username}</td>
				<td>${user.name}</td>
				<td>${user.mobile}</td>
				<td>${user.email}</td>
			</tr>
		</table>
	</c:forEach>

</c:if>

</body>
</html>