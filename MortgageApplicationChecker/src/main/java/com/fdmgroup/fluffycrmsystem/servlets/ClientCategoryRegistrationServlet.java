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

import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategoryFactory;
import com.fdmgroup.fluffycrmsystem.clientmanagement.ClientFactory;
import com.fdmgroup.fluffycrmsystem.controllers.ClientCategoryController;
import com.fdmgroup.fluffycrmsystem.controllers.ClientController;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.ClientReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.ClientWriteCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.jpa.ClientORMReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.jpa.ClientORMWriteCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.ClientCategoryReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.ClientCategoryWriteCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.jpa.ClientCategoryORMReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.jpa.ClientCategoryORMWriteCommand;

public class ClientCategoryRegistrationServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String page = null;

		// Consume variables
		String categoryName = req.getParameter("categoryName");
		String description = req.getParameter("description");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceunit");

		ClientCategoryReadCommand clientCategoryReader = new ClientCategoryORMReadCommand(entityManagerFactory);
		ClientCategoryWriteCommand clientCategoryWriter = new ClientCategoryORMWriteCommand(entityManagerFactory);
		ClientCategoryFactory categoryFactory = new ClientCategoryFactory();
		ClientCategoryController categoryController = new ClientCategoryController(clientCategoryReader, clientCategoryWriter, categoryFactory);

		boolean registered = categoryController.generateClientCategory(categoryName, description);
		if (registered) {
			page = "../WEB-INF/clientCategoryRegistrationConfirm.jsp";
			// Add the user name String back to the request
			req.setAttribute("categoryName", categoryName);
		} else {
			page = "../WEB-INF/error.jsp";
		}

		// Perform a redirect
		RequestDispatcher dispatcher = req.getRequestDispatcher(page);
		dispatcher.forward(req, resp);
	}
}
