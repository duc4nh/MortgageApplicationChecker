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
import com.fdmgroup.fluffycrmsystem.controllers.ClientCategoryController;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.ClientCategoryReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.ClientCategoryWriteCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.jpa.ClientCategoryORMReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.jpa.ClientCategoryORMWriteCommand;

public class ClientCategoryManagementServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceunit");

		ClientCategoryReadCommand clientCategoryReader = new ClientCategoryORMReadCommand(entityManagerFactory);
		ClientCategoryWriteCommand clientCategoryWriter = new ClientCategoryORMWriteCommand(entityManagerFactory);
		ClientCategoryFactory categoryFactory = new ClientCategoryFactory();
		ClientCategoryController categoryController = new ClientCategoryController(clientCategoryReader, clientCategoryWriter, categoryFactory);

		List<ClientCategory> allClientCategory = categoryController.getAllClientCategory();
		
		req.setAttribute("allClientCategory", allClientCategory);
		RequestDispatcher dispatcher = req.getRequestDispatcher("../WEB-INF/clientCategoryManagement.jsp");
		dispatcher.forward(req, resp);
	}
}
