<%@page import="com.revature.pms.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>
<title>Add Product</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="css/Styles.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script>
	function validate() {
		var accountNumber = document.getElementById("accountNumber").value;
		var errorAccountNumber = document.getElementById("errorAccountNumber");
		var customerName = document.getElementById("customerName").value;
		var errorCustomerName = document.getElementById("errorCustomerName");
		var customerPassword = document.getElementById("customerPassword").value;
		var errorPassword = document.getElementById("errorPassword");
		var customerPassword = document.getElementById("customerPassword").value;
		var errorPassword = document.getElementById("errorPassword");
		var confirmpassword = document.getElementById("confirmpassword").value;
		var errorConfirmpassword = document.getElementById("errorConfirmpassword");
		var age = document.getElementById("age").value;
		var errorAge = document.getElementById("errorAge");
		var address = document.getElementById("address").value;
		var errorAddress = document.getElementById("errorAddress");

		if (accountNumber.length == 0) {
			errorAccountNumber.innerHTML = "Please enter a Mobile Number";
			return false;
		} else if (customerName.length == 0) {
			errorCustomerName.innerHTML = "Please enter a Customer Name";
			return false;
		}else if (customerPassword != confirmpassword) {
			errorPassword.innerHTML = "Please enter a Password";
			return false;
	    } 
		else if (customerPassword.length == 0) {
			errorPassword.innerHTML = "Please enter a Password";
			return false;
		} else if (confirmpassword.length == 0) {
			errorConfirmpassword.innerHTML = "Please Confirm a Password";
			return false;
		} else if (age.length == 0) {
			errorAge.innerHTML = "Please enter Age";
			return false;
		} else if (address.length == 0) {
			errorAddress.innerHTML = "Please enter Address";
			return false;
		} else {
			alert("Details Updated " + customerName);
		}
	}
</script>
</head>

<body bgcolor="grey">
	<h1>
		<marquee>
			<u>
				<p>
					<b>Welcome to the World Bank App</b>
				</p>
			</u>

		</marquee>
	</h1>
	<% Customer customer = new Customer();
			%>
	<form action="UpdateCustomerController2" onsubmit="return validate()">
		<center>
			<fieldset>
				<div class="Card text-white bg-dark" style="max-width: 30rem;">
					<div class="card-body"><br>
						<h2>Update Details Form</h2><br>
						Mobile Number :
						<div id="errorAccountNumber" style="color: red"></div>
						<input type="text" class="form-control mb-2 mr-sm-4"
							name="accountNumber" id="accountNumber"> Customer Name :
						<div id="errorCustomerName" style="color: red"></div>
						<input type="text" class="form-control mb-2 mr-sm-2"
							name="customerName" id="customerName"> Password :
						<div id="errorPassword" style="color: red"></div>
						<input type="text" class="form-control mb-2 mr-sm-2"
							name="customerPassword" id="customerPassword"> Confirm
						Password :
						<div id="errorConfirmpassword" style="color: red"></div>
						<input type="text" class="form-control mb-2 mr-sm-2"
							name="confirmpassword" id="confirmpassword"> 
						Age :<div id="errorAge" style="color: red"></div>
						<input type="text" class="form-control mb-2 mr-sm-2" name="age"
							id="age"> Address :
						<div id="errorAddress" style="color: red"></div>
						<input type="text" class="form-control mb-2 mr-sm-2"
							name="address" id="address"> <br>
						<button type="submit" class="btn btn-info mb-2">Update</button>
						<button type="reset" class="btn btn-warning mb-2">Clear</button>
					</div>
				</div>
			</fieldset>
		</center>
	</form>
	<button type="button" class="btn btn-dark ">
		<a href="Home.html">Home</a>
	</button>
</body>

</html>