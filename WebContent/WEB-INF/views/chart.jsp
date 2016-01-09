<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Group Project</title>

<meta name="keywords" content="" />
<meta name="description" content="" />

<link
	href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900|Quicksand:400,700|Questrial"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath}/css/default.css"
	rel="stylesheet" type="text/css" media="all" />
<link href="${pageContext.request.contextPath}/css/fonts.css"
	rel="stylesheet" type="text/css" media="all" />

<script type="text/javascript">
	window.onload = function() {
		var chart = new CanvasJS.Chart("chartContainer", {

			title : {
				text : "Account Balance History"
			},
			data : [//array of dataSeries              
			{ //dataSeries object

				/*** Change type "column" to "bar", "area", "line" or "pie"***/
				type : "${type}",
				dataPoints : [ {
					label : "Quarter 1",
					y : ${q1}
				}, {
					label : "Quarter 2",
					y : ${q2}
				}, {
					label : "Quarter 3",
					y : ${q3}
				}, {
					label : "Quarter 4",
					y : ${q4}
				} ]
			} ]
		});

		chart.render();
	}
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/canvasjs.min.js"></script>

</head>

<body>

	<div id="header-wrapper">
		<div id="header" class="container">
			<div id="logo">
				<h1>
					<a href="#">Mortage Application Checker</a>
				</h1>
				<div id="menu">
					<ul>
						<li class="active"><a
							href="${pageContext.request.contextPath}/protected/home">Profile</a></li>
						<li><a href="${pageContext.request.contextPath}/logout">Logout</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	
	<div id="page-wrapper">
		<div id="welcome" class="container">
			<div class="title">
				<h2>Chart for account ID ${accountId}</h2>
			</div>
		</div>
	</div>
	
	<div class="wrapper">
		<div align="center" style="width: 100%">
	
		<div id="chartContainer" align="center" style="height: 500px; width: 70%; margin: 0 auto;"></div>

		<br/>
		<p>Click <a href="${pageContext.request.contextPath}/protected/searchforaccount2?clientId=${clientId}">HERE</a> to go back.</p>
	
		<div id="copyright" class="container">
			<p>&copy; Mortage Application Checker | All rights reserved.</p>
		</div>

		</div>
	</div>
</body>

</html>