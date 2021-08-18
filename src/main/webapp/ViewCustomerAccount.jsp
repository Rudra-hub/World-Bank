<%@page import="com.revature.pms.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link type="text/css" rel="stylesheet" href="css/Styles.css">
<title>Customers Info</title>
</head>
<body>
	<h1>
		<marquee>
			<u>
				<p>
					<b>Welcome to the World Bank App 
				</p> </b>
			</u>

		</marquee>
	</h1>
	<center>
		<h2>Customer Details</h2>
	</center>
	<%
	List<Customer> customers = (List<Customer>) session.getAttribute("allCustomers");
	%>
	<div>
		<table border="5" BORDERCOLOR=black align="center" cellpadding="10"
			cellspacing="10" class="text-white bg-dark">
			<th>Customer Id</th>
			<th>Customer Account Number</th>
			<th>Customer Name</th>
			<th>Account Type</th>
			<th>Age</th>
			<th>Address</th>
			<th>Issue Date</th>
			<th>Update</th>
			<%
			for (int i = 0; i < customers.size(); i++) {
				Customer customer = customers.get(i);
			%>
			<tr>
				<td><%=customer.getCustomerId()%></td>
				<td><%=customer.getAccountNumber()%></td>
				<td><%=customer.getCustomerName()%></td>
				<td><%=customer.getAccountType()%></td>
				<td><%=customer.getAge()%></td>
				<td><%=customer.getAddress()%></td>
				<td><%=customer.getIssueDate()%></td>
				<td><button type="button" class="btn btn-info">
						<a
							href="UpdateCustomer.jsp">Edit</a>
					</button></td>

			</tr>
			<%
			}
			%>

		</table>
	</div>
	<center>
		<br />
		<br /> <br>
		<button type="button" class="btn btn-dark ">
			<a href="Home.html">Home</a>
		</button>
	</center>
</body>
</html>