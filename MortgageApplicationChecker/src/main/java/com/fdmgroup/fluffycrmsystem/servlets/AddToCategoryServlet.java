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

public class AddToCategoryServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String page;

		// Consume variables
		String categoryToAdd = req.getParameter("categoryToAdd");
		int clientId = Integer.parseInt(req.getParameter("clientId"));

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceunit");
		ClientFactory clientFactory = new ClientFactory();
		ClientReadCommand clientReadCmd = new ClientORMReadCommand(entityManagerFactory);
		ClientWriteCommand clientWriteCmd = new ClientORMWriteCommand(entityManagerFactory);
		ClientController clientController = new ClientController(clientReadCmd, clientWriteCmd, clientFactory);
		ClientCategoryReadCommand clientCategoryReader = new ClientCategoryORMReadCommand(entityManagerFactory);
		ClientCategoryWriteCommand clientCategoryWriter = new ClientCategoryORMWriteCommand(entityManagerFactory);
		ClientCategoryFactory categoryFactory = new ClientCategoryFactory();
		ClientCategoryController categoryController = new ClientCategoryController(clientCategoryReader, clientCategoryWriter, categoryFactory);
		Client client = clientController.getClientById(clientId);

		if (categoryController.assignClientToCategory(client, categoryToAdd)) {
			ClientCategory category = categoryController.searchForCategory(categoryToAdd);
			List<Client> clients = category.getClients();
			req.setAttribute("categoryName", categoryToAdd);
			req.setAttribute("clients", clients);
			page = "../WEB-INF/allClientsInCategory.jsp";
		} else {
			page = "../WEB-INF/error.jsp";
		}

		RequestDispatcher dispatcher = req.getRequestDispatcher(page);
		dispatcher.forward(req, resp);
	}
}
