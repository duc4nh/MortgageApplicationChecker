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
import com.fdmgroup.fluffycrmsystem.controllers.ClientStatisticReportController;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.ClientReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.ClientWriteCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.jpa.ClientORMReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.jpa.ClientORMWriteCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.ClientCategoryReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.ClientCategoryWriteCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.jpa.ClientCategoryORMReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.jpa.ClientCategoryORMWriteCommand;
import com.fdmgroup.fluffycrmsystem.logic.clientstatisticreport.ClientStatisticReport;
import com.fdmgroup.fluffycrmsystem.logic.clientstatisticreport.ClientStatisticReportFactory;
import com.fdmgroup.fluffycrmsystem.logic.clientstatisticreport.ClientStatisticReportGenerator;
import com.fdmgroup.fluffycrmsystem.transactionmanagement.Transaction;

public class ClientReportServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// Consume variables
		String categoryName = req.getParameter("categoryName");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceunit");
		
		ClientCategoryReadCommand clientCategoryReader = new ClientCategoryORMReadCommand(entityManagerFactory);
		ClientCategoryWriteCommand clientCategoryWriter = new ClientCategoryORMWriteCommand(entityManagerFactory);
		ClientCategoryFactory categoryFactory = new ClientCategoryFactory();
		ClientCategoryController categoryController = new ClientCategoryController(clientCategoryReader, clientCategoryWriter, categoryFactory);
		ClientCategory category = categoryController.searchForCategory(categoryName);
		ClientStatisticReportFactory reportFactory = new ClientStatisticReportFactory();
		ClientStatisticReportGenerator reportGenerator = new ClientStatisticReportGenerator(reportFactory);
		ClientFactory clientFactory = new ClientFactory();
		ClientReadCommand clientReadCmd = new ClientORMReadCommand(entityManagerFactory);
		ClientWriteCommand clientWriteCmd = new ClientORMWriteCommand(entityManagerFactory);
		ClientController clientController = new ClientController(clientReadCmd, clientWriteCmd, clientFactory);
		
		List<Client> allClients = category.getClients();
		int numberOfTransaction = 0;
		double totalSpend = 0;
		for (Client client : allClients) {
			List<Transaction> trans = clientController.getClientTransactions(client.getId());
			for (Transaction tran : trans) {
				numberOfTransaction++;
				totalSpend += tran.getAmount();
			}
		}
		
		ClientStatisticReportController reportController = new ClientStatisticReportController(reportGenerator);
		ClientStatisticReport clientReport = reportController.generateReport(allClients, numberOfTransaction, totalSpend);
		
		//--
		req.setAttribute("categoryName", categoryName);
		req.setAttribute("clientReport", clientReport);
		RequestDispatcher dispatcher = req.getRequestDispatcher("../WEB-INF/clientReport.jsp");
		dispatcher.forward(req, resp);
	}
}
