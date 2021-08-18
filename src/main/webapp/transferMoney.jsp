<%@page import="com.revature.pms.model.Customer"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transfer</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link type="text/css" rel="stylesheet" href="css/Styles.css" />
<script type="text/javascript" src="js/validator.js"></script>
</head>
<body>s
	<h2 align="center">Transfer Money</h2>
	<% Customer customer = new Customer();
			%>
	<form>
	<center>
		<div class="Card text-white bg-dark" style="max-width: 25rem;">
			<div class="card-body">
				Receiver ID : <input type="number" name="receiverId" id="receiverId" required/><br><br>
				Enter Amount : <input type="number" name="amount" id="amount" min="10" required/><br><br>
				<button type="submit" formaction="TransferMoneyController?customerId?=<%=customer.getCustomerId()%>" 
				class="btn btn-danger">Transfer
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