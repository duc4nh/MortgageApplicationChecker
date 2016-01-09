<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client Statistical Report</title>
<meta name="description" content="website description" />
<meta name="keywords" content="website keywords, website keywords" />
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript" src="../js/modernizr-1.5.min.js"></script>
</head>

<body>
	<%@include file="header.jsp" %>

	<h1>Client Statistical Report</h1>
	<h2>Group name: ${categoryName}</h2>
	
	<p>Number of Clients: <font color="#F67400">${clientReport.numberOfClient}</font></p>
  	<p>Total spend of all Clients: <font color="#F67400"><fmt:formatNumber type="number" maxFractionDigits="2" value="${clientReport.totalSpend}" /></font></p>
  	<p>Average Spend on each Client: <font color="#F67400"><fmt:formatNumber type="number" maxFractionDigits="2" value="${clientReport.averageSpend}" /></font></p>
  	<p>Number of Transaction made: <font color="#F67400">${clientReport.numberOfTransaction}</font></p>
  	<p>Average number of Transaction on each Client: <font color="#F67400"><fmt:formatNumber type="number" maxFractionDigits="2" value="${clientReport.averageOfTransaction}" /></font></p>
  	<p>Average age of clients in this group: <font color="#F67400"><fmt:formatNumber type="number" maxFractionDigits="2" value="${clientReport.averageAge}" /></font></p>
	
	<div>
		<p>Click <a href="../index.jsp">HERE</a> to go back</p>
	</div>
	
	<%@include file="footer.jsp" %>
</body>
</html>