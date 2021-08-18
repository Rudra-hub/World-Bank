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
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="css/Styles.css" />
<script type="text/javascript" src="js/validator.js"></script>
</head>
<body>
	<br>
	<h2 align="center" style="background-color:#52575d;">Dashboard</h2>
	<%
	Customer customer = new Customer();
	%>
	<br>
	<br>
	<form action="FindCustomerController">
		<center>
	
			<div class="row">
				<div class="col-sm-4">
					<div class="card text-white bg-dark">
						<div class="card-body">
							<h5 class="card-title">Search Customer</h5>
							<p class="card-text">With supporting text below as a natural
								lead-in to additional content.</p>
							<button type="submit" class="btn btn-info mb-2"><a href="customerSearch.jsp">Search Customer</a></button>
						</div>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="card text-white bg-dark">
						<div class="card-body">
							<h5 class="card-title">Deposit Money To Customer</h5>
							<p class="card-text">With supporting text below as a natural
								lead-in to additional content.</p>
							<button type="button" class="btn btn-light">
								<a href="depositMoneyToAnother.jsp">Deposit Money</a>
							</button>
						</div>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="card text-white bg-dark">
						<div class="card-body">
							<h5 class="card-title">Display Customers</h5>
							<p class="card-text">With supporting text below as a natural
								lead-in to additional content.</p>
							<button type="submit" class="btn btn-warning mb-2"><a href="PrintCustomerController">Display Customer</a></button>
						</div>
					</div>
				</div>
				</div><br><br>
				<div class="row">
				<div class="col-sm-4">
					<div class="card text-white bg-dark">
						<div class="card-body">
							<h5 class="card-title">Display Employees</h5>
							<p class="card-text">With supporting text below as a natural
								lead-in to additional content.</p>
							 <button type="submit" class="btn btn-warning mb-2"><a href="PrintEmployeeController">Display Employee</a></button>
						</div>
					</div>
				</div>
				
				
				<div class="col-sm-4">
					<div class="card text-white bg-dark">
						<div class="card-body">
							<h5 class="card-title">Search Employee</h5>
							<p class="card-text">With supporting text below as a natural
								lead-in to additional content.</p>
							<button type="submit" class="btn btn-info mb-2"><a href="employeeSearch.jsp">Search Employee</a></button>
						</div>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="card text-white bg-dark">
						<div class="card-body">
							<h5 class="card-title">My Account <i class="large material-icons card-text">account_circle</i></h5>
							<p class="card-text">With supporting text below as a natural
								lead-in to additional content.</p>
							<button type="button" class="btn btn-light">
								<a href="ViewMyEmployeeAccount">View</a>
							</button>
						</div>
					</div>
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