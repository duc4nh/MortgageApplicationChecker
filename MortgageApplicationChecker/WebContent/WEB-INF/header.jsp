<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<div id="main">

	<header>
		<div id="logo">
			<div id="logo_text">
				<!-- class="logo_colour", allows you to change the colour of the text -->
				<h1>
					<a href="${pageContext.request.contextPath}/index.jsp">CRM<span class="logo_colour">System</span></a>
				</h1>
				<h2>Customer Relationship Management</h2>
			</div>
		</div>

		<nav>
			<ul class="sf-menu" id="nav">
				<li class="selected"><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
				<li><a href="#">Menu</a>
					<ul>
						<li><a href="${pageContext.request.contextPath}/protected/clientManagement?filter=full">View All Clients</a></li>
						<li><a href="${pageContext.request.contextPath}/protected/clientCategoryManagement">View All Groups</a></li>
						<li><a href="${pageContext.request.contextPath}/protected/clientRegistrationForm">Register New Client</a></li>
						<li><a href="${pageContext.request.contextPath}/protected/clientCategoryRegistrationForm">Generate New Group</a></li>
						<li><a href="#">User</a>
							<ul>
								<li><a href="${pageContext.request.contextPath}/protected/loginConfirmation">Login</a></li>
								<li><a href="${pageContext.request.contextPath}/logout">Sign Out</a></li>
							</ul>
						</li>
					</ul>
				</li>
				<li><a href="#">Contact Me</a></li>
			</ul>
		</nav>
	</header>

	<div id="site_content">