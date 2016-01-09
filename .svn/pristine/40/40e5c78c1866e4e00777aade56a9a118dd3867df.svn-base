package com.fdmgroup.fluffycrmsystem.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.fluffycrmsystem.clientmanagement.ClientFactory;
import com.fdmgroup.fluffycrmsystem.controllers.ClientController;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.ClientReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.ClientWriteCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.jpa.ClientORMReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.jpa.ClientORMWriteCommand;

public class ClientRegistrationServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String page = null;

		// Consume variables
		String firstName = req.getParameter("firstname");
		String lastName = req.getParameter("lastname");
		String phoneNumber = req.getParameter("phoneNumber");
		String address = req.getParameter("address");
		String organisation = req.getParameter("organisation");
		String dobString = req.getParameter("dob");
		
		Calendar dob = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd");
			Date date = sdf.parse(dobString);
			dob = Calendar.getInstance();
			dob.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceunit");

		ClientFactory clientFactory = new ClientFactory();
		ClientReadCommand clientReadCmd = new ClientORMReadCommand(entityManagerFactory);
		ClientWriteCommand clientWriteCmd = new ClientORMWriteCommand(entityManagerFactory);
		ClientController clientController = new ClientController(clientReadCmd, clientWriteCmd, clientFactory);

		boolean registered = clientController.registerClient(firstName, lastName, phoneNumber, address, organisation, dob);
		if (registered) {
			page = "../WEB-INF/clientRegistrationConfirm.jsp";
			// Add the user name String back to the request
			req.setAttribute("firstname", firstName);
		} else {
			page = "../WEB-INF/error.jsp";
		}

		// Perform a redirect
		RequestDispatcher dispatcher = req.getRequestDispatcher(page);
		dispatcher.forward(req, resp);
	}
}
