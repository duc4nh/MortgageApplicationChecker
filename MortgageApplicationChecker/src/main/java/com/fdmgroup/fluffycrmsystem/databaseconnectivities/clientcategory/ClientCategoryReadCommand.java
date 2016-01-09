package com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory;

import java.util.List;

import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategory;

public interface ClientCategoryReadCommand {

	public ClientCategory searchForCategory(String name);
	public List<ClientCategory> getAllClientCategory();
}
