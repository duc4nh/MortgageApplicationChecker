<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client Profile</title>
<meta name="description" content="website description" />
<meta name="keywords" content="website keywords, website keywords" />
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript" src="../js/modernizr-1.5.min.js"></script>
</head>

<body>
	<%@include file="header.jsp"%>

	<div>
		<h1>Client Profile:</h1>
	</div>

	<img src="../images/profile.jpg" />

	<div>
		<table>
			<tr>
				<th>Client Information</th>
				<th>----------------------------------------------------------------</th>
			</tr>
			<tr>
				<td>ID</td>
				<td>${client.id}</td>
			</tr>
			<tr>
				<td>First Name</td>
				<td>${client.firstName}</td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td>${client.lastName}</td>
			</tr>
			<tr>
				<td>Phone Number</td>
				<td>${client.phoneNumber}</td>
			</tr>
			<tr>
				<td>Address</td>
				<td>${client.address}</td>
			</tr>
			<tr>
				<td>Organisation</td>
				<td>${client.organisation}</td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><fmt:formatDate value="${client.dob.time}"
						pattern="dd-MM-yyyy" /></td>
			</tr>
		</table>
	</div>

	<div>
		<p>
			Click <a href="../index.jsp">HERE</a> to go back
		</p>
	</div>

	<%@include file="footer.jsp"%>
</body>
</html>