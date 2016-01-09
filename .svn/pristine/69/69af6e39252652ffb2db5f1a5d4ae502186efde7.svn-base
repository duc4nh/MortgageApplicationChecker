/*package com.fdmgroup.fluffycrmsystem.controllers;

import java.util.Calendar;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategory;
import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategoryFactory;
import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
import com.fdmgroup.fluffycrmsystem.clientmanagement.ClientFactory;
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

public class Runner {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceunit");
		
		ClientCategoryReadCommand clientCategoryReader = new ClientCategoryORMReadCommand(entityManagerFactory);
		ClientCategoryWriteCommand clientCategoryWriter = new ClientCategoryORMWriteCommand(entityManagerFactory);
		ClientCategoryFactory categoryFactory = new ClientCategoryFactory();
		ClientCategoryController categoryController = new ClientCategoryController(clientCategoryReader, clientCategoryWriter, categoryFactory);

		ClientFactory clientFactory = new ClientFactory();
		ClientReadCommand clientReadCmd = new ClientORMReadCommand(entityManagerFactory);
		ClientWriteCommand clientWriteCmd = new ClientORMWriteCommand(entityManagerFactory);
		ClientController clientController = new ClientController(clientReadCmd, clientWriteCmd, clientFactory);
		
		String firstName = "Duc";
		String lastName = "Nguyen";
		String phoneNumber = "075";
		String address = "An address";
		String organisation = "org";
		Calendar dob = Calendar.getInstance();
		dob.set(1995, 12, 10);
		//clientController.registerClient(firstName, lastName, phoneNumber, address, organisation, dob);
		
		//Client client = clientController.getClientById(81);
		System.out.println(clientController.getClientTransactions(81).size());
		//categoryController.generateClientCategory("category 2", "some descriptions");
		//System.out.println(categoryController.assignClientToCategory(client, "A Group"));
		//System.out.println(categoryController.removeClientFromCategory(6, "Example"));
		
		ClientCategory category = categoryController.searchForCategory("category 1");
		System.out.println(category.getClients().size());
		System.out.println(category.getClients().get(0).getTransactions().size());
		
		ClientStatisticReportFactory reportFactory = new ClientStatisticReportFactory();
		ClientStatisticReportGenerator reportGenerator = new ClientStatisticReportGenerator(reportFactory);
		ClientStatisticReportController reportController = new ClientStatisticReportController(category, reportGenerator);
		
		ClientStatisticReport report = reportController.generateReport();
		System.out.println(report.getAverageAge());
		System.out.println(report.getNumberOfClient());
	}
}*/