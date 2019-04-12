<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Balance Form</title>
</head>
<body>
<body>
<center>
<h2 style="color:#4289f4">Show Balance form</h2>
	<form action="showBalance.obj" method="post">
		Enter Account Number: <input type="number" name="accountNumber">
		<input type="submit" value="showBalance">
	</form>
	<h2 style="color:#0066CC">${message}</h2>
	<br> <a href="showBankOperationPage.obj">Back To OperationPage</a>
</center>
</body>
</html>