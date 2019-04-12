<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Details</title>
</head>
<body>
<c:if test="${empty bank}">
<c:out value="no data available"/>
</c:if>

<c:if test="${not empty bank}">

	
<center>
	<h2 style="color:#4289f4">All Account Details </h2>
	
	<table border="1px">
		<tr>
			<th bgcolor="bisque">Account Number</th>
			<th bgcolor="bisque"> AccountHolder Name</th>
			<th bgcolor="bisque">Address</th>
			<th bgcolor="bisque">Contact Number</th>
			<th bgcolor="bisque">Balance</th>
			<th bgcolor="bisque">Email Id</th>
						
			
			
			
		</tr>
	
		<c:forEach var="accountList" items="${bank}">
			<tr>
				<td>${accountList.accountNumber}</td>
				<td>${accountList.accountHolderName}</td>
				<td></td>
				<td>${accountList.contactNumber}</td>
				<td>${accountList.balance}</td>
				<td>${accountList.email}</td>
								
				
			</tr>
		</c:forEach>
	</table>
	<a href="showBankOperationPage.obj">Click
			Here To Go to Home</a>
</center>
</c:if>
</body>
</html>