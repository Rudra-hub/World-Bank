<%@page import="com.revature.pms.model.Customer"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Customer</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link type="text/css" rel="stylesheet" href="css/Styles.css" />
<script type="text/javascript" src="js/validator.js"></script>
</head>
<body>s
	<h2 align="center">Find Customer</h2>
	<% Customer customer = new Customer();
			%>
	<form action="FindCustomerController">
	<center>
		<div class="Card text-white bg-dark" style="max-width: 25rem;">
			<div class="card-body">
				<button type="button" class="btn btn-danger">
						<a href="ViewBalanceController?customerId=<%=customer.getCustomerId()%>">View Balance</a>
				</button>
			</div>
		</div>
	</center>
	</form>
	<br />

	<br />
	<button type="button" class="btn btn-dark ">
			<a href="Home.html">Home</a>
		</button>
</body>
</html>