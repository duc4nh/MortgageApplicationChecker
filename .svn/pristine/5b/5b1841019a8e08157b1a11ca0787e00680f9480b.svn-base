<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
<meta name="description" content="website description" />
<meta name="keywords" content="website keywords, website keywords" />
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<script type="text/javascript" src="../js/modernizr-1.5.min.js"></script>
</head>

<body>
	<%@include file="header.jsp"%>

		<h1>Login</h1>
		<!-- j_security_check map to a pre-defined servlet which checks user details -->
		<form method="POST" action="j_security_check">
			<h2>Username</h2>
			<p><input type="text" name="j_username" required /></p>
			<h2>Password</h2>
			<p><input type="password" name="j_password" required /></p>
			<p><input id="form-submit-button" type="submit" value="Login" /></p>
		</form>

	<%@include file="footer.jsp"%>
</body>
</html>