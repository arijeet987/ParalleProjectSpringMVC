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
<h1 style="color:#f4ad42">${withdraw}</h1>
<h1 style="color:#f4ad42">${deposit}</h1>
	<h2 style="color:#4289f4">Show Transaction </h2>
	<table border="1px">
		<tr>
			<th bgcolor="bisque">Transaction id</th>
			<th bgcolor="bisque">Account Number</th>
			<th bgcolor="bisque">Amount</th>
			<th bgcolor="bisque">Balance</th>
			<th bgcolor="bisque">Date Of Transaction</th>
			<th bgcolor="bisque">Time Of Transaction</th>
			<th bgcolor="bisque">Transaction Type</th>
		</tr>
	
			<tr>
				<td>${transaction.transactionid}</td>
				<td>${transaction.accountnumber}</td>
				<td>${transaction.amount}</td>
				<td>${transaction.balance}</td>
				<td>${transaction.dateoftransaction}</td>
				<td>${transaction.timeoftransaction}</td>
				<td>${transaction.type}</td>
			</tr>
	</table>
	
		<a href="showBankOperationPage.obj">Back to Operation Page</a>
</center>


</body>
</html>