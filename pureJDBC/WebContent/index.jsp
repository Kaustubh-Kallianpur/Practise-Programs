<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home - JDBC</title>
</head>
<body>
	<a href="index.jsp">Home</a><br>
	<c:if test="${empty LogIn}"><a href="login.jsp">Login</a></c:if><br>
	<c:if test="${empty LogIn}"><a href="register.jsp">Register</a></c:if><br>
	<a href="getUsers">User List</a><br>
	<c:if test="${!empty LogIn}"><a href="logout">Logout</a></c:if><br>
<hr>
${success}<br>
${loggedin}<br>
</body>
</html>