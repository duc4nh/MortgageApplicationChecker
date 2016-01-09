package com.fdmgroup.fluffycrmsystem.controllers;

import java.util.List;

import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategory;
import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategoryFactory;
import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.ClientCategoryReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.ClientCategoryWriteCommand;

public class ClientCategoryController {
	
	private ClientCategoryReadCommand reader;
	private ClientCategoryWriteCommand writer;
	private ClientCategoryFactory categoryFactory;
	
	public ClientCategoryController(ClientCategoryReadCommand reader, ClientCategoryWriteCommand writer, ClientCategoryFactory categoryFactory) {
		this.reader = reader;
		this.writer = writer;
		this.categoryFactory = categoryFactory;
	}
	
	public List<ClientCategory> getAllClientCategory() {
		return reader.getAllClientCategory();
	}

	public boolean generateClientCategory(String categoryName, String description) {
		return writer.generateClientCategory(categoryFactory.generateClientCategory(categoryName, description));
	}

	public boolean assignClientToCategory(Client client, String categoryName) {
		return writer.assignClientToCategory(client, categoryName);
	}
	
	public boolean removeClientFromCategory(int clientId, String categoryName) {
		return writer.removeClientFromCategory(clientId, categoryName);
	}

	public ClientCategory searchForCategory(String categoryName) {
		return reader.searchForCategory(categoryName);
	}
}
