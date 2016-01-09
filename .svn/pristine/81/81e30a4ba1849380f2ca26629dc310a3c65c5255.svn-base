<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Group</title>
<meta name="description" content="website description" />
<meta name="keywords" content="website keywords, website keywords" />
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript" src="../js/modernizr-1.5.min.js"></script>
</head>

<body>
	<%@include file="header.jsp" %>

	<div>
		<h1>All clients in group ${categoryName}</h1>
	</div>
	
	<div>
		<table>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Organisation</th>
				<th>Profile</th>
				<th>Remove From This Category</th>
			</tr>
			
			<c:forEach items="${clients}" var="client">
				<tr>
				<td>${client.id}</td>
				<td>${client.firstName}</td>
				<td>${client.lastName}</td>
				<td>${client.organisation}</td>
				<td><a href="${pageContext.request.contextPath}/protected/clientProfile?clientId=${client.id}">View Profile</a></td>
				<td><a href="${pageContext.request.contextPath}/protected/removeFromCategory?clientId=${client.id}&categoryName=${categoryName}">Remove</a></td>
				</tr>
			</c:forEach>
			
		</table>
	</div>
	
	<p><a href="${pageContext.request.contextPath}/protected/clientReport?categoryName=${categoryName}">View Statistical Report</a></p>
	
	<div>
		<p>Click <a href="../index.jsp">HERE</a> to go back</p>
	</div>
	
	<%@include file="footer.jsp" %>
</body>
</html>