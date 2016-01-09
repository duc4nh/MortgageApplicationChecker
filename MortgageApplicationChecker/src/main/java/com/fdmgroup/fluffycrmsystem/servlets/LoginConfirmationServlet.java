package com.fdmgroup.fluffycrmsystem.servlets;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginConfirmationServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Principal is a special kind of session scoped variable -> wraps the
		// logged-in user’s username
		Principal userPrincipal = req.getUserPrincipal();
		// Get username
		String username = userPrincipal.getName();

		// Get a user's role and add it as a session variable
		boolean isAdmin = req.isUserInRole("admin_user");
		HttpSession session = req.getSession();
		if (isAdmin) {
			session.setAttribute("role", "admin_user");
		}

		req.setAttribute("username", username);
		RequestDispatcher dispatcher = req.getRequestDispatcher("../WEB-INF/loginConfirmation.jsp");
		dispatcher.forward(req, resp);
	}
}
