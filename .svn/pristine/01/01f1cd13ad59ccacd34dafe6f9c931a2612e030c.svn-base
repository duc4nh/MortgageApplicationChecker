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
import com.fdmgroup.fluffycrmsystem.controllers.ClientCategoryController;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.ClientCategoryReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.ClientCategoryWriteCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.jpa.ClientCategoryORMReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.jpa.ClientCategoryORMWriteCommand;

public class RemoveFromCategoryServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// Consume variables
		String categoryName = req.getParameter("categoryName");
		int clientId = Integer.parseInt(req.getParameter("clientId"));
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceunit");
		
		ClientCategoryReadCommand clientCategoryReader = new ClientCategoryORMReadCommand(entityManagerFactory);
		ClientCategoryWriteCommand clientCategoryWriter = new ClientCategoryORMWriteCommand(entityManagerFactory);
		ClientCategoryFactory categoryFactory = new ClientCategoryFactory();
		ClientCategoryController categoryController = new ClientCategoryController(clientCategoryReader, clientCategoryWriter, categoryFactory);
		
		categoryController.removeClientFromCategory(clientId, categoryName);
		
		ClientCategory category = categoryController.searchForCategory(categoryName);
		List<Client> clients = category.getClients();
		
		//--
		req.setAttribute("categoryName", categoryName);
		req.setAttribute("clients", clients);
		RequestDispatcher dispatcher = req.getRequestDispatcher("../WEB-INF/allClientsInCategory.jsp");
		dispatcher.forward(req, resp);
	}
}
