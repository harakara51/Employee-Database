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
					<li><a href="addNovel.jsp">Update</a></li>

				</ul>
			</div>
		</nav>
	</div>
	<div class="parallax-container" id="tableholder">

		<div class="parallax">
			<img src="images/pic8.jpg">
			<div class="card lime lighten-5" id="card-table5">
				<table class="bordered" id="table1">

					<thead>
						<tr>
							<th data-field="id" colspan="3">Database result</th>
						</tr>
						<tr>
							<c:forEach var="head" items="${tableHeader}">
						<th>"${head}"
								</th>
	</c:forEach>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="test" items="${TABLE}">
							<tr>
								<c:forEach var="cell" items="${test}">
									<td>"${cell}"</td>
						</c:forEach>
							</tr>
						</c:forEach>
					</tbody>
		</table>
	</div>
		</div>
	</div>
	
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