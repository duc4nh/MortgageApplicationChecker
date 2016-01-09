<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Generate new Category</title>
<meta name="description" content="website description" />
<meta name="keywords" content="website keywords, website keywords" />
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript" src="../js/modernizr-1.5.min.js"></script>
</head>

<body>
	<%@include file="header.jsp" %>
	
	<h1>Generate new Category</h1>
	
	<form action="${pageContext.request.contextPath}/protected/clientCategoryRegistration" method="GET">
		<h2>Category Name</h2>
		<p><input type="text" name="categoryName" required /></p>
		<h2>Description</h2>
		<p><textarea name="description" rows="5" cols="50">Input description here...</textarea></p>
  		<p><input id="form-submit-button" type="submit" value="Generate" /></p>
	</form>
	
	<%@include file="footer.jsp" %>
</body>
</html>