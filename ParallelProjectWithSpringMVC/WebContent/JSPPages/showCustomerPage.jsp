<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
</head>
<body>
<center>
	<h2 style="color:#4289f4">Search Customer </h2>
	<table border="1px">
		<tr>
			<th bgcolor="bisque">Account Number</th>
			<th bgcolor="bisque">AccountHolder Name</th>
			<th bgcolor="bisque">Address</th>
			<th bgcolor="bisque">Contact Number</th>
				<th bgcolor="bisque">Balance </th>
					<th bgcolor="bisque">Email Id </th>
		</tr>
	
			<tr>
				<td>${bank.accountNumber}</td>
				<td>${bank.accountHolderName}</td>
				<td></td>
				<td>${bank.contactNumber}</td>
				<td>${bank.balance}</td>
				<td>${bank.email}</td>
			</tr>
	</table>
	<br> <a href="showBankOperationPage.obj">Back To HomePage</a>
</center>
</body>
</html>