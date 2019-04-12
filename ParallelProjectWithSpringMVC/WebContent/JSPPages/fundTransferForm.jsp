<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>

	<h2>Fund Transfer Form</h2>
	<form action="fundTransfer.obj" method="post">
		Enter your Account Number: <input type="number" name="accountNumber"><br><br>
		Enter Reciever's Account Number: <input type="number" name="accountNumber1"><br><br>
		Enter Amount: <input type="number" name="amount" min="0" title="positive value only" required="true"><br><br>
		<input type="submit" value="Transfer">
	</form>
	 <h3 style="color:green">${message}</h3>
	<br> <a href="showBankOperationPage.obj">Back To HomePage</a>
</center>
</body>
</html>