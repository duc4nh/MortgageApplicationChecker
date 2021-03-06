<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	 <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<link href="${pageContext.request.contextPath}/css/fonts.css" rel="stylesheet" type="text/css" media="all" />

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
				<h2>Search for a client</h2>
			</div>
		</div>
	</div>
	<div class="wrapper">
		<div align="center" style="width: 100%">


			<form method="GET" action= "searchforclient2">
					Input Client ID: <input type="text" name="clientId" align="middle"/> <input type="submit"
						value="Search" />
			</form>

			<br/>
			<br/>
			
			<table align="center" style="border: solid;">
				<tr>
					<th align="center" style="padding: 0 10px 0 10px;">ID</th>
					<th align="center" style="padding: 0 10px 0 10px;">First name</th>
					<th align="center" style="padding: 0 10px 0 10px;">Last name</th>
					<th align="center" style="padding: 0 10px 0 10px;">Phone
						Number</th>
					<th align="center" style="padding: 0 10px 0 10px;">Address</th>
					<th align="center" style="padding: 0 10px 0 10px;">Date Of
						Birth</th>
					<th align="center" style="padding: 0 10px 0 10px;">Credit
						History ID</th>
				</tr>


					<tr>
						<td align="center" style="padding: 0 10px 0 10px;">${client.id}</td>
						<td align="center" style="padding: 0 10px 0 10px;">${client.firstName}</td>
						<td align="center" style="padding: 0 10px 0 10px;">${client.lastName}</td>
						<td align="center" style="padding: 0 10px 0 10px;">${client.phoneNumber}</td>
						<td align="center" style="padding: 0 10px 0 10px;">${client.address}</td>
						<td align="center" style="padding: 0 10px 0 10px;"><fmt:formatDate pattern="dd-MM-yy" value="${client.dob.time}" /></td>
      					<td align="center" style="padding: 0 10px 0 10px;">${CreditId.id}</td>
					</tr>
			</table>
		</div>
	</div>
	<div id="copyright" class="container">
		<p>&copy; Mortage Application Checker | All rights reserved.</p>
	</div>

</body>
</html>