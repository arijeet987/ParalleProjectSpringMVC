<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
		<h1 style="color: #0066CC">Welcome to KFC Bank</h1>
		<br />
		<br />

		<!--This code below displays the form to add a trainee to the database	-->
		<h3>Enter Personal Details</h3>
		<%-- <c:url var="myAction" value="/addTrainee.obj"></c:url> --%>
		<form:form action="addSuccessCustomer.obj" method="post" modelAttribute="bank">
			<table bgcolor="#DCDCDC">

				<tr>
					<td>AccountHolder Name:<span style="color: red;">*</span></td>
					<td><form:input path="accountHolderName" /></td>
					<td style="color: red;"><form:errors path="accountHolderName"></form:errors></td>

				</tr>

				<tr>
					<td>Contact Number:<span style="color: red;">*</span></td>
					<td><form:input type="number" path="contactNumber" /></td>
					<td style="color: red;"><form:errors path="contactNumber"></form:errors></td>

				</tr>

				<tr>
					<td>Enter EmailId:<span style="color: red;">*</span></td>
					<td><form:input path="email" /></td>
					<td style="color: red;"><form:errors path="email"></form:errors></td>

				</tr>
			<tr>
					<td>Enter Address:<span style="color: red;">*</span></td>
					<td><form:input path="Address" /></td>
					<td style="color: red;"><form:errors path="Address"></form:errors></td>

				</tr>
				<tr>
					<td>Enter Balance:<span style="color: red;">*</span></td>
					<td><form:input path="balance" pattern="[0-9]*\\.?[0-9]*" title="positive value only" required="true"/></td>
					<td style="color: red;"><form:errors path="balance"></form:errors></td>

				</tr>
				<tr>
					<td colspan="2"><input type="submit" name="submit"
						value="Add Customer"></input></td>
				</tr>
			</table>

		</form:form>
		<a href="showBankOperationPage.obj">OperationPage</a>
	</center>

</body>
</html>