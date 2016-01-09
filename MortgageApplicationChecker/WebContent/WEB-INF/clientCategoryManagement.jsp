<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Management</title>
<meta name="description" content="website description" />
<meta name="keywords" content="website keywords, website keywords" />
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript" src="../js/modernizr-1.5.min.js"></script>
</head>

<body>
	<%@include file="header.jsp" %>
	
	<div>
		<h1>All client groups in the system</h1>
	</div>
	
	<div>
		<h2>
			<a href="${pageContext.request.contextPath}/protected/clientCategoryRegistrationForm">Generate new Group</a>
		</h2>
	</div>
	
	<div>
		<table>
			<tr>
				<th>Group Name</th>
				<th>Description</th>
				<th>Number of Clients</th>
				<th>View Report</th>
			</tr>
			
			<c:forEach items="${allClientCategory}" var="category">
			<tr>
				<td><a href="${pageContext.request.contextPath}/protected/allClientsInCategory?categoryName=${category.categoryName}">${category.categoryName}</a></td>
				<td>${category.description}</td>
				<td>${category.categorySize}</td>
				<td><a href="${pageContext.request.contextPath}/protected/clientReport?categoryName=${category.categoryName}">View Statistical Report</a></td>
			</tr>
			</c:forEach>
			
		</table>
	</div>
	
	<div>
		<p>Click <a href="../index.jsp">HERE</a> to go back</p>
	</div>
	
	<%@include file="footer.jsp" %>
</body>
</html>