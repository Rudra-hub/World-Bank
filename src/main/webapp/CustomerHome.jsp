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
	 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css" />
		<link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
		<script src="https://kit.fontawesome.com/a81368914c.js"></script>
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
							<h5 class="card-title">View Balance <i class="large material-icons card-text">remove_red_eye</i></h5>
							
							<p class="card-text">With supporting text below as a natural
								lead-in to additional content.</p>
							<button type="button" class="btn btn-info">
								<a href="ViewBalanceController?customerId=<%=customer.getCustomerId()%>">View
									Balance</a>
							</button>
						</div>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="card text-white bg-dark">
						<div class="card-body">
							<h5 class="card-title">Deposit Money</h5>
							<p class="card-text">With supporting text below as a natural
								lead-in to additional content.</p>
							<button type="button" class="btn btn-info">
								<a href="depositMoney.jsp">Deposit Money</a>
							</button>
						</div>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="card text-white bg-dark">
						<div class="card-body">
							<h5 class="card-title">Withdraw Money</h5>
							<p class="card-text">With supporting text below as a natural
								lead-in to additional content.</p>
							<button type="button" class="btn btn-warning">
								<a href="withdrawMoney.jsp">Withdraw Money</a>
							</button>
						</div>
					</div>
				</div>
				</div><br>
				<div class="row">
				<div class="col-sm-4">
					<div class="card text-white bg-dark">
						<div class="card-body">
							<h5 class="card-title">Transfer Money</h5>
							<p class="card-text">With supporting text below as a natural
								lead-in to additional content.</p>
							<button type="button" class="btn btn-warning">
								<a href="transferMoney.jsp">Transfer Money</a>
							</button>
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
							<h5 class="card-title">My Account <i class="large material-icons card-text">account_circle</i></h5>
							
							<p class="card-text">With supporting text below as a natural
								lead-in to additional content.</p>
							<button type="button" class="btn btn-light">
								<a href="ViewMyAccount">View</a>
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