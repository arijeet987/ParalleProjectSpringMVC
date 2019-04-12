<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body  background="https://ak4.picdn.net/shutterstock/videos/8093134/thumb/8.jpg">
<center>
<h1 style="color:#0066CC">KFC Bank Home Page</h1>
<h1 style="color:green">${balance}</h1>
<table border="1px">
	<tr><td><h2 style="color:#ea020d">Pick an option</h2></td></tr>
	<tr><td><a href="addCustomer.obj"><b  style="color:#cc3954" ><i  style="color:#cc3954">Add Customer</i></b></a></td></tr>
	<tr><td><a href="showAllDetails.obj"><b  style="color:#cc3954"><i  style="color:#cc3954">Show All Account Details</i></b></a></td></tr>
	<tr><td><a href="showBalanceForm.obj"><b  style="color:#cc3954"><i  style="color:#cc3954">Show Balance</i></b></a></td></tr>
	<tr><td><a href="ShowWithdrawForm.obj"><b  style="color:#cc3954"><i  style="color:#cc3954">Withdraw</i></b></a></td></tr>
	<tr><td><a href="ShowDepositForm.obj"><b  style="color:#cc3954"><i  style="color:#cc3954">Deposit</i></b></a></td></tr>
	<tr><td><a href="searchForm.obj"><b  style="color:#cc3954"><i  style="color:#cc3954">Search Your Account</i></b></a></td></tr>
	<tr><td><a href="fundTransferForm.obj"><b  style="color:#cc3954"><i style="color:#cc3954">Fund Transfer</i></b></a></td></tr>
	<tr><td><a href="printTransactionForm.obj"><b  style="color:#cc3954"><i  style="color:#cc3954">Print Transactions</i></b></a></td></tr>
	
</table>
</center>
</body>
</html>