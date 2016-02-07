<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no" />
<title>Translated Novels</title>

<!-- CSS  -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link href="css/materialize.css" type="text/css" rel="stylesheet"
	media="screen,projection" />
<link href="css/style.css" type="text/css" rel="stylesheet"
	media="screen,projection" />
<link href="css/animate.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<div class="navbar-fixed">
		<nav>
			<div class="nav-wrapper brown lighten-1">
				<a href="#!" class="brand-logo">Database</a>
				<ul class="right hide-on-med-and-down">
					<li><a href="index.jsp">Home</a></li>
					<li><a href="update.jsp">Update</a></li>

				</ul>
			</div>
		</nav>
	</div>


	<div class="card" id="card-table5">



		<form action="database.do" method="GET">



			<select name="table">
			<option value="employees">employees</option>
				<option value="assignments">assignments</option>
				<option value="departments">departments</option>
			<option value="jobs">Jobs</option>
				<option value="locations">Location</option>
				<option value="projects">Projects</option>
			</select> <select name="fields_Choice" multiple>
				<option value="id">ID</option>
				<option value="firstname">First Name</option>
				<option value="lastname">Last Name</option>
				<option value="gender">Gender</option>
				<option value="email">Email</option>
				<option value="extension">Extension</option>
				<option value="salary">Salary</option>
				<option value="commision_pct">Commission pct</option>
				<option value="department_id">department_id</option>
				<option value="job_id">job_id</option>
				<option value="address">address</option>
				<option value="city">city</option>
				<option value="Zipcode">Zipcode</option>

			</select>
			<button class="btn waves-effect waves-light blue darken-2"
				type="submit" name="ReadMORE">
				Submit Query <i class="material-icons right">send</i>				
			</button>
		</form>
	</div>

<ul class="collapsible" data-collapsible="accordion" id ="advsearch">
    <li>
      <div class="collapsible-header"><i class="material-icons">search</i>Advanced Search</div>
      <div class="collapsible-body lime lighten-5">
    <form action="Advdatabase.do" method="GET">
		<input type="search">
			<button class="btn waves-effect waves-light blue darken-2"
				type="submit" name="ReadMORE">
				Submit Query <i class="material-icons right">send</i>
			</button>
		</form>
    </div>
    </li>
    
  </ul>

	<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
	<script src="js/materialize.js"></script>
	<script src="js/init.js"></script>
	<script>
		$(document).ready(function() {
			$('select').material_select();
		});
	</script>


</body>
</html>