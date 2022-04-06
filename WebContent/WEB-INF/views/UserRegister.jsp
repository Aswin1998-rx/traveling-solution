<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Traveler &mdash; Free Website Template, Free HTML5 Template by FreeHTML5.co</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Website Template by FreeHTML5.co" />
	<meta name="keywords" content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
	<meta name="author" content="FreeHTML5.co" />

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700" rel="stylesheet">
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Themify Icons-->
	<link rel="stylesheet" href="css/themify-icons.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="css/magnific-popup.css">

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="css/bootstrap-datepicker.min.css">

	<!-- Owl Carousel  -->
	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">

	<!-- Theme style  -->
	<link rel="stylesheet" href="css/style.css">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
	<script>  
function matchPassword() {  
  var pw1 = document.getElementById("pass1");  
  var pw2 = document.getElementById("pass2");  
  if(pw1 != pw2)  
  {   
    alert("Passwords did not match");  
  } else {  
    alert("Password created successfully");  
  }  
}  
</script>  

</head>
<body>
<h1> Register Form</h1>

			<div class="tab-content">
										<div class="tab-content-inner active" data-content="signup">
											<h3>User sign up</h3>
											
												<div class="row form-group">
													<div class="col-md-12">
													<form:form action="save" id="regform" method="post" modelAttribute="user">
														<label for="fullname">User Name</label>
														<input type="text" name="name" placeholder="user name" class="form-control" >
													</div>
												</div>
												
												<div class="row form-group">
													<div class="col-md-12">
														<label for="district">District</label>
														<select  name="district" class="form-control" path="district" >
															<option value="Alappuzha">Alappuzha</option>
															<option value="Ernakulam">Ernakulam</option>
															<option value="Idukki">Idukki</option>
															<option value="Kannur">Kannur</option>
															<option value="Kasaragod">Kasaragod</option>
															<option value="Kollam">Kollam</option>
															<option value="Kottayam">Kottayam</option>
															<option value="Kozhikode">Kozhikode</option>
															<option value="Malappuram">Malappuram</option>
															<option value="Palakkad">Palakkad</option>
															<option value="Pathanamthitta">Pathanamthitta</option>
															<option value="Thiruvananthapuram">Thiruvananthapuram</option>
															<option value="Thrissur">Thrissur</option>
															<option value="Wayanad">Wayanad</option>
														</select>
													</div>
													
												</div>
												<div class="row form-group">
													<div class="col-md-12">
														<label for="Mobile Number">Mobile Number</label>
														<form:input type="text" path="phone_no"  placeholder="Mobile Number" class="form-control" />
													</div>
												</div>
												
												<div class="row form-group">
													<div class="col-md-12">
														<label for="password">Password</label>
														<form:input type="password" id="pass1" path="password" placeholder="Password" class="form-control" />
													</div>
												</div>
												<div class="row form-group">
													<div class="col-md-12">
														<label for="cPasswod">Confirm Password</label>
														<input type="password" id="pass2"  placeholder="Confirm Password" class="form-control" >
													</div>
												</div>

												<div class="row form-group">
													<div class="col-md-12">
														<input type="submit" class="btn btn-primary btn-block" id="save" name="save" value="Register" onmouseover="matchPassword()">
														
														</form:form>
														
													</div>
												</div>
											
										</div>

										
									
			
</body>