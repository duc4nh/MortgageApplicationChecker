<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Confirmation</title>
<meta name="description" content="website description" />
<meta name="keywords" content="website keywords, website keywords" />
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript" src="../js/modernizr-1.5.min.js"></script>
</head>

<body>
	<%@include file="header.jsp" %>
	
	<h1>You have logged in, ${username}</h1>

	<c:if test="${sessionScope.role=='admin_user'}">
		<h2>You are an Admin!</h2>
		<p>Here are some additional functionalities for Admin: (but they haven't been implemented yet, so never mind...)</p>
	</c:if>
	
	<div>
		<p>Click <a href="../index.jsp">HERE</a> to go back</p>
	</div>

	<%@include file="footer.jsp" %>
</body>
</html>