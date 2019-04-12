<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Customer Form</title>
</head>
<body>
<center>
 
	<h2 style="color:#4289f4">Search Customer Form</h2>
	<form action="searchCustomer.obj" method="post">
		Enter Account Number: <input type="number" name="accountNumber">
		<input type="submit" value="Search">
	</form>
	<h1 style="color:red">${message}</h1>
	<br> <a href="showBankOperationPage.obj">Back To HomePage</a>
</center>
</body>
</html>