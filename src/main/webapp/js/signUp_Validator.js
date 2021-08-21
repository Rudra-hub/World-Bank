        // Sample Sign up form created //


function validator(){
    var allFields = new Array();
    var userName = document.forms["SignupForm"]["userName"];
    var password = document.forms["SignupForm"]["password"];
    var confirmPassword = document.forms["SignupForm"]["confirmPassword"];
    var email = document.forms["SignupForm"]["email"];
    var mobile = document.forms["SignupForm"]["mobile"];
    var options = document.getElementsByName("gender");
    for (var i = 0; i < options.length; i++) {
        if (options[i].checked) {
            // do whatever you want with the checked radio
            var calc = options[i].value;
        }
    }
    var options2 = document.getElementsByName("notification");
    calc1 = [];
    for (var i = 0; i < options2.length; i++) {
        if (options2[i].checked) {
            // do whatever you want with the checked radio
            calc1.push(options2[i].value);

        }
    }    

    if (userName.length == 0) {
        window.alert("Please enter your name.");
        userName.focus();
        return false;
    }
    else if (password.value == "") {
        window.alert("Please enter your password.");
        password.focus();
        return false;
    }
    else if (password.value != confirmPassword.value) {
        window.alert("Password doesnot match.");
        confirmPassword.focus();
        return false;
    }
    else if (email.value == "") {
        window.alert("Please enter your Email-ID.");
        confirmPassword.focus();
        return false;
    }
    else if (mobile.value == "") {
        window.alert("Please enter your Mobile no.");
        confirmPassword.focus();
        return false;
    }
    else if(typeof calc == "undefined"){
        alert("Gender is mandatory fields")
        return false;
    }
    else if (calc1.length==0) {
        alert("Please select atleast one option in notification");
        return false;
    }
    if (what.selectedIndex != "---Select-----") {
        alert("Please select your Payment option.");
        what.focus();
        return false;
    }
    else{
        return true;
    }

    
    

    for(i=0;i<8;i++){
        allFields[i]= document.forms[0].elements[i].value;
    }
    console.log(allFields);
    return false;
}
