<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bank App</title>
</head>
<body background="https://png.pngtree.com/thumb_back/fw800/back_pic/04/52/46/01585fd8958dcb8.jpg">
	<center>
		<h1 style="color: #0066CC">Welcome KFC Bank</h1>
		<br />
		<br />

		<!--This code below displays the form to log in	-->
		<h3>Please Enter the LogIn Details</h3>
		<form action="validateLogin.obj" method="post">
			Username: <input type="text" name="username" required="true"><br><br>
			Password: <input type="password" name="password" required="true"><br><br>
			<input type="submit" value="login">
			<h2  style="color:#110205">${message}</h2>
		</form>
	</center>
</body>
</html>