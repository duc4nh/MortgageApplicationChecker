<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client Management</title>
<meta name="description" content="website description" />
<meta name="keywords" content="website keywords, website keywords" />
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript" src="../js/modernizr-1.5.min.js"></script>
</head>

<body>
	<%@include file="header.jsp"%>

	<div>
		<h1>All clients in the system</h1>
	</div>

	<div>
		<h2>
			<a
				href="${pageContext.request.contextPath}/protected/clientRegistrationForm">Register
				New Client</a>
		</h2>
	</div>

	<div>
		<br />
		<form
			action="${pageContext.request.contextPath}/protected/clientManagement"
			method="GET">
			<h2>Search for client by
			<select name="filter">
				<option value="firstName">First Name</option>
				<option value="lastName">Last Name</option>
				<option value="organisation">Organisation</option>
			</select> <input type="text" name="pattern" required /> <input
				id="form-submit-button" type="submit" value="Go" />
			</h2>
		</form>
		<br />
	</div>

	<div>
		<table>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Phone Number</th>
				<th>Address</th>
				<th>Organisation</th>
				<th>DOB</th>
				<th>Profile</th>
				<th>Add To Group</th>
			</tr>

			<c:forEach items="${allClients}" var="client">
				<tr>
					<td>${client.id}</td>
					<td>${client.firstName}</td>
					<td>${client.lastName}</td>
					<td>${client.phoneNumber}</td>
					<td>${client.address}</td>
					<td>${client.organisation}</td>
					<td><fmt:formatDate value="${client.dob.time}"
							pattern="dd-MM-yyyy" /></td>
					<td><a
						href="${pageContext.request.contextPath}/protected/clientProfile?clientId=${client.id}">View
							Profile</a></td>
					<td>
						<form
							action="${pageContext.request.contextPath}/protected/addToCategory"
							method="GET">
							<input name="clientId" type="hidden" value="${client.id}" /> <select
								name="categoryToAdd">
								<c:forEach items="${allCategory}" var="category">
									<option value="${category.categoryName}">${category.categoryName}</option>
								</c:forEach>
							</select> <input id="form-submit-button" type="submit" value="Add" />
						</form>
					</td>
				</tr>
			</c:forEach>

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