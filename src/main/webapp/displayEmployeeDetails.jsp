<%@page import="com.revature.pms.model.Customer"%>
<%@page import="com.revature.pms.model.Employee"%>
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
		<h2>Employee Details</h2>
	</center>
	<%
	List<Employee> employees = (List<Employee>) session.getAttribute("allEmployee");
	%>
	<div>
		<table border="5" BORDERCOLOR=black align="center" cellpadding="10"
			cellspacing="10" class="text-white bg-dark">
			<th>Employee Id</th>
			<th>Customer Name</th>
			<th>Branch</th>
			<th>Mobile Number</th>
			<th>Email</th>
			<th>Joining Date</th>
			<th>Delete</th>
			<%
			for (int i = 0; i < employees.size(); i++) {
				Employee employee = employees.get(i);
			%>
			<tr>
				<td><%=employee.getEmployeeId()%></td>
				<td><%=employee.getEmployeeName()%></td>
				<td><%=employee.getBranch()%></td>
				<td><%=employee.getMobileNumber()%></td>
				<td><%=employee.getEmail()%></td>
				<td><%=employee.getJoiningDate()%></td>
				<td><button type="button" class="btn btn-danger">
						<a
							href="DeleteEmployeeController?employeeId=<%=employee.getEmployeeId()%>">Delete</a>
					</button></td>

			</tr>
			<%
			}
			%>

		</table>
	</div>
	<center>
		<br />
		<%=session.getAttribute("message")%>
		<br /> <br>
		<button type="button" class="btn btn-dark ">
			<a href="Home.html">Home</a>
		</button>
	</center>
</body>
</html>