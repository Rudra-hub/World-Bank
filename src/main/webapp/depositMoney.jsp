<%@page import="com.revature.pms.model.Customer"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deposit</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link type="text/css" rel="stylesheet" href="css/Styles.css" />
<script type="text/javascript" src="js/Validator.js"></script>
</head>
<body>
	<h2 align="center">Deposit Money</h2>
	<% Customer customer = new Customer();
			%>
	<form>
	<center>
		<div class="Card text-white bg-dark" style="max-width: 25rem;">
			<div class="card-body">
				Enter Amount : 
				<div id="errorAmount" style="color: red"></div>
				<input type="number" name="amount" id="amount" min="10" required/><br><br>
				<button type="submit" formaction="DepositMoneyController?customerId?=<%=customer.getCustomerId()%>" 
				class="btn btn-danger">Deposit
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