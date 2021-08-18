<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Employee</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link type="text/css" rel="stylesheet" href="css/Styles.css" />
<script type="text/javascript" src="js/validator.js"></script>
</head>
<body>
	<h2 align="center">Find Employee</h2>
	<form action="FindEmployeeController">
	<center>
		<div class="Card text-white bg-dark" style="max-width: 25rem;">
			<div class="card-body">
				<table cellpadding="10" cellspacing="10">
					<tr>
						<td style="color:#FFFFFF">Employee Id</td>
						<td><input type="text" name="employeeId" id="employeeId" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="Search"
							class="btn btn-danger"></td>
						<td><input type="reset" value="Clear"
							class="btn btn-warning"></td>
					</tr>
				</table>
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