<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="css/styles.css" />
<script type="text/javascript" src="js/validator.js"></script>
<link type="text/css" rel="stylesheet" href="css/Styles.css">
</head>
<body>
	<h1>
		<marquee>

			<p style="color: #1f6feb;">
				<b>Welcome to the World Bank</b>
			</p>

		</marquee>
	</h1>
	<form action="AuthenticateEmployee2">
		<center>
			<fieldset>
				<div class="Card text-white bg-dark" style="max-width: 30rem;">
					<div class="card-header"><h2>Login Information</h2></div>
					<div class="card-body">
						<!-- <h2>Login Information</h2> -->
						<i class="large material-icons card-text">account_circle</i>
						Employee ID :<label for="text" class="mr-sm-2"></label> <input
							type="text" class="form-control mb-2 mr-sm-2" name="employeeId"
							id="employeeId"> 
							<i class="large material-icons card-text">lock_outline</i>
							Password :<label for="pwd"
							class="mr-sm-2"></label> <input type="password"
							class="form-control mb-2 mr-sm-2" name="employeePassword"
							id="employeePassword">

						<button type="submit" class="btn btn-danger">Submit</button>
						<button type="reset" value="Clear" class="btn btn-warning  ">Reset</button>
					</div>
			</fieldset>
		</center>
	</form>

	<button type="button" class="btn btn-dark">
		<a href="Home.html">Home</a>
	</button>

</body>
</html>