<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
				<h2>Client ${client.firstName} 's account(s):</h2>
				<h2>(Client ID: ${client.id})</h2>
			</div>
		</div>
	</div>
	
	<div class="wrapper">
		<div align="center" style="width: 100%">

			<form method="GET" action="searchforaccount2">
				Input Client ID: <input type="text" name="clientId" /> <input
					type="submit" value="Search" />
			</form>
			
			<br /> <br />

			<table align="center" style="border: solid;">
				<tr>
					<th align="center" style="padding: 0 10px 0 10px;">Account ID</th>
					<th align="center" style="padding: 0 10px 0 10px;">Balance Q1
					</th>
					<th align="center" style="padding: 0 10px 0 10px;">Balance Q2
					</th>
					<th align="center" style="padding: 0 10px 0 10px;">Balance Q3</th>
					<th align="center" style="padding: 0 10px 0 10px;">Balance Q4
					</th>
					<th align="center" style="padding: 0 10px 0 10px;">Interest
						Rate</th>
					<th align="center" style="padding: 0 10px 0 10px;">Max Deposit
					</th>
					<th align="center" style="padding: 0 10px 0 10px;">Type</th>
				</tr>

				<c:forEach items="${accounts}" var="temp">
					<tr>
						<td align="center" style="padding: 0 10px 0 10px;">${temp.id}</td>
						<td align="center" style="padding: 0 10px 0 10px;">${temp.balanceQ1}</td>
						<td align="center" style="padding: 0 10px 0 10px;">${temp.balanceQ2}</td>
						<td align="center" style="padding: 0 10px 0 10px;">${temp.balanceQ3}</td>
						<td align="center" style="padding: 0 10px 0 10px;">${temp.balanceQ4}</td>
						<td align="center" style="padding: 0 10px 0 10px;">${temp.interestRate}</td>
						<td align="center" style="padding: 0 10px 0 10px;">${temp.maxDeposit}</td>
						<td align="center" style="padding: 0 10px 0 10px;">${temp.type}</td>
					</tr>
				</c:forEach>
			</table>
			
			<br/>
			<p>View Chart:</p>
			<form action="${pageContext.request.contextPath}/protected/chart" method="GET">
				<input name="clientId" type="hidden" value="${client.id}" />
				<select name="type">
					<option value="pie">Pie Chart</option>
					<option value="line">Line Chart</option>
					<option value="column">Column Chart</option>
				</select>
				<select name="accountId">
					<c:forEach items="${accounts}" var="temp">
						<option value="${temp.id}">Account ID ${temp.id}</option>
					</c:forEach>
				</select> 
				<input id="form-submit-button" type="submit" value="Draw" />
			</form>
			
		</div>
	</div>
	
	<div id="copyright" class="container">
		<p>&copy; Mortage Application Checker | All rights reserved.</p>
	</div>

</body>
</html>