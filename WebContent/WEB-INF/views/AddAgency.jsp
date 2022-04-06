<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
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


</head>
<body>
 <h1>Agency Register </h1>

			<div class="tab-content">
						<div class="tab-content-inner active" data-content="signup">
						<h3>User sign up</h3>
											
												<div class="row form-group">
													<div class="col-md-12">
													<form:form action="savea" id="savea" method="post" modelAttribute="agency" value="aRegister">
														<label for="fullname">Agency Name</label>
														<input type="text" name="aname" placeholder="Agency name" class="form-control" >
													</div>
												</div>
												
												<div class="row form-group">
													<div class="col-md-12">
														<label for="mobile_number">Mobile Number</label>
														<input type="text" class="form-control"  path="mobile_number" name="mobile_number">
													</div>
													
												</div>
												
													
												
												<div class="row form-group">
													<div class="col-md-12">
														<label for="password">Password</label>
														<input type="password" id="pass1"  placeholder="Password" class="form-control" name="password" >
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
														<input type="submit" class="btn btn-primary btn-block" id="save" name="save"  onclick="matchPassword()">
														
														</form:form >
														
													</div>
												</div>
											
										</div>
<script>  
function matchPassword() {  
  var pw1 = document.getElementById("#pass1");  
  var pw2 = document.getElementById("#pass2");  
  if(pw1 != pw2)  
  {   
    alert("Passwords did not match");  
  } else {  
    alert("Password created successfully");  
  }  
}  
</script>  
										
									
			
</body>