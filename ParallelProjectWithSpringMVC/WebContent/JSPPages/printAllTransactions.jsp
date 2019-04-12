<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AllTransactions</title>
</head>
<body>
<center>

<c:if test="${empty transactions}">
<h2 style="color:red">Sorry!!No Available Transactions</h2>
</c:if>

<c:if test="${not empty transactions}">

	<h2 style="color:#f4ad42">All Transactions</h2>

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
	
			<c:forEach var="transactionList" items="${transactions}">
				
			<tr>
				<td>${transactionList.transactionid}</td>
				<td>${transactionList.accountnumber}</td>
				<td>${transactionList.amount}</td>
				<td>${transactionList.balance}</td>
				<td>${transactionList.dateoftransaction}</td>
				<td>${transactionList.timeoftransaction}</td>
				<td>${transactionList.type}</td>
			
			</tr>
		
		</c:forEach>
			<tr colspan="7"><td></td><td></td><td></td><td><a href="showBankOperationPage.obj">Back to Operation Page</a></td><td></td><td></td><td></td></tr>
	</table>
	
</c:if>

</center>

</body>
</html>