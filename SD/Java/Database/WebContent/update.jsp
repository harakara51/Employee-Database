<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no" />
<title>Databases</title>

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
					<li><a href="addNovel.jsp">Update</a></li>

				</ul>
			</div>
		</nav>
	</div>

<div class="row" id ="titlerow">
     
        <div class="card-panel light-blue lighten-1" id ="title">
          <span class="white-text">
 Choose your table to insert data </span>
        </div>
  
    </div>
	<ul class="collapsible" data-collapsible="accordion" id ="employee">
	<li>
      <div class="collapsible-header"><i class="material-icons">filter_drama</i>Employees Database</div>
      <div class="collapsible-body lime lighten-5" id ="employee_From">
      
       <div class="row" >
    <form class="col s12" action= "updateDatabase.do" method ="GET">
      <input type="hidden" name ="database" value ="employees">
      <div class="row">
     
        <div class="input-field col s3">  
          <input type="text" name="firstname" class="validate"  value ="John">
          <label class="firstname" for="firstname">First Name</label>
        </div>
        <div class="input-field col s3">
          <input id="Author" type="text" name ="lastname" value ="Doe" class="validate">
          <label class="active" for="lastname">Last Name</label>
        </div>
        <div class="input-field col s3">
          <input id="email" type="email" name ="email" class="validate" value ="employee@gmail.com">
          <label class="active" for="email">Email</label>
        </div>
         <div class="input-field col s2">
          <input id="Author" type="text" name ="extension" class="validate" value ="0">
          <label class="active" for="extension">Extension</label>
        </div>
     
        <div class="input-field col s1">
         	<select name="gender" class="validate">
  <option value="M">M</option>
  <option value="F">F</option>
  </select>
        <label  class="active" for="gender">Gender</label>
        </div>   
      </div>   
 
       <div class="row">
       <div class="input-field col s3">
          <input id="Commission pct" type="text" name ="commission_pct" class="validate" value ="0">
          <label class="active" for="commission_pct">Commission pct </label>
        </div>
        <div class="input-field col s3">
        <select name="job_id" required >
        <option selected disabled>Choose JOB here</option>
        <option value="1">President</option>
  <option value="2">Vice President</option>
  <option value="3">Director </option>
  <option value="4"> Manager</option>
  <option value="5">Supervisor </option>
  <option value="6">Administrative Assistant</option>
  <option value="7">Secretary </option>
  <option value="8"> Lead Engineer </option>
  <option value="9">Engineer  </option>
  <option value="10">Junior Engineer </option>
  <option value="11">DataBase Administrator </option>
  <option value="12">DataBase Operator  </option>
  <option value="13">Systems Administrator </option>
  <option value="14">Systems Operator </option>
  <option value="15">Data Analyst  </option>
  <option value="16"> Project Lead </option>
  <option value="17">Senior Developer </option>
  <option value="18">Developer</option>
  <option value="19">Junior Engineer  </option>
  <option value="20">Product Evangelist </option>
  <option value="21">Senior Sales Rep   </option>
  <option value="22">Account Rep</option>
  <option value="23">Sales Rep </option>
  <option value="24"> Tester </option>
  <option value="25">Receptionist </option>
  <option value="26">Data Entry Clerk    </option>
  <option value="27">Technical Writer  </option>
  <option value="28">Trainer      </option>
  <option value="29">COO       </option>
  <option value="30">CFO    </option>
  <option value="31"> CIO  </option>
  <option value="31"> Test Designer  </option>
</select>
       </div>
         <div class="input-field col s3">
        <select name="department_id" required >
  <option selected disabled>Choose DEPT here</option>
        <option value="1">Research </option>
  <option value="2">Administration   </option>
  <option value="3">Software Development </option>
  <option value="4">Hardware Development </option>
  <option value="5">Test And Integration  </option>
  <option value="6">Sales </option>  
  <option value="7">HR       </option>
  <option value="8"> Facilities  </option>
  <option value="9">Operations  </option>
  <option value="10">Documentation  </option>
  
</select>
     </div>
 	<div class="input-field col s3">  
          <input  id="salary" type="text" name="salary" class="validate" value ="0">
          <label class="firstname" for="salary">Salary</label>
        </div>
     
       </div> 
       <div class="row">
    
        <div class="input-field col s4">
          <input id="Author" type="text" name ="address" value ="3 Peachtree Plaza" class="validate">
          <label class="active" for="address">Address </label>
        </div>
        <div class="input-field col s3">
          <input id="Author" type="text" name ="city" value ="Atlanta" class="validate">
          <label class="active" for="city"> City </label>
        </div>
         <div class="input-field col s2">
          <input id="Author" type="text" name ="state" class="validate" value ="GA" required>
          <label class="active" for="state">State </label>
        </div>
     
 	<div class="input-field col s3">  
          <input  id="NovelName" type="text" name="zipcode" class="validate" value ="30365">
          <label class="firstname" for="zipcode">Zipcode</label>
        </div>
     
       </div> 
       <button class="btn waves-effect waves-light blue darken-2" type="submit" name="ReadMORE">
				Update Database <i class="material-icons right">send</i>
			</button>
    </form>
  </div>
       
      </div>
    </li>
</ul>




<ul class="collapsible" data-collapsible="accordion" id ="advsearch">
    <li>
      <div class="collapsible-header"><i class="material-icons">search</i>Advanced Search</div>
      <div class="collapsible-body lime lighten-5">
    <form action="Advdatabase.do" method="GET">
		<input type="text" name ="fieldsChoice">

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