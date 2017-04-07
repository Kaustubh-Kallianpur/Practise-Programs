<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Here</title>
<script src="resources/js/jquery-3.2.0.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">

</head>
<body>
	<div class="container">
		<h1 style="text-align: center;"> LOGIN </h1>
		<br>
			<div class="row">
			<div class="col-md-5">
			<form action="login" method="post">
				<table class="table">
					<tr>
						<td>User Name</td>
						<td><input type="text" autofocus="autofocus" placeholder="UserName" maxlength="100" required="required" name="username"></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" placeholder="Password" maxlength="50" name="password" required="required"></td>
					</tr>	
					<tr>
						<td><input type="submit" value="Login"></td>
						<td><input type="reset" value="Clear Form"></td>
					</tr>
				</table>
			</form>
			</div>
			<div class="col-md-7"></div>
			</div>
			${loggedin}
			${LogOut}
	</div>
</body>
</html>