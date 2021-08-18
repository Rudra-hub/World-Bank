function validate() {
	var amount = document.getElementById("amount").value;
	var errorAmount = document.getElementById("errorAmount").value;
	if(amount < 1){
		errorAmount.innerHTML = "Please enter a valid amount";
		return false;
	}else{
		alert("Trasanction Successful " + customerName);
	}
	}