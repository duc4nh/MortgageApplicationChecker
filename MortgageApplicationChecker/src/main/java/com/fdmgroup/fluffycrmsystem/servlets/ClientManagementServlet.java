package com.fdmgroup.fluffycrmsystem.servlets;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategory;
import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategoryFactory;
import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
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

public class ClientManagementServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String pattern = req.getParameter("pattern");
		String filter = req.getParameter("filter");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceunit");

		ClientFactory clientFactory = new ClientFactory();
		ClientReadCommand clientReadCmd = new ClientORMReadCommand(entityManagerFactory);
		ClientWriteCommand clientWriteCmd = new ClientORMWriteCommand(entityManagerFactory);
		ClientController clientController = new ClientController(clientReadCmd, clientWriteCmd, clientFactory);
		
		List<Client> clients;
		// Consume variable
		if (filter.equals("firstName")) {
			clients = clientController.getClientByFirstName(pattern);
		} else if (filter.equals("lastName")) {
			clients = clientController.getClientByLastName(pattern);
		} else if (filter.equals("organisation")) {
			clients = clientController.getClientByOrg(pattern);
		} else {
			clients = clientController.getAllClient();
		} 

		ClientCategoryReadCommand clientCategoryReader = new ClientCategoryORMReadCommand(entityManagerFactory);
		ClientCategoryWriteCommand clientCategoryWriter = new ClientCategoryORMWriteCommand(entityManagerFactory);
		ClientCategoryFactory categoryFactory = new ClientCategoryFactory();
		ClientCategoryController categoryController = new ClientCategoryController(clientCategoryReader, clientCategoryWriter, categoryFactory);
		List<ClientCategory> allCategory = categoryController.getAllClientCategory();
		
		req.setAttribute("allCategory", allCategory);
		req.setAttribute("allClients", clients);
		RequestDispatcher dispatcher = req.getRequestDispatcher("../WEB-INF/clientManagement.jsp");
		dispatcher.forward(req, resp);
	}
}
