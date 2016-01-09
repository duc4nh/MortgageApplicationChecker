package com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategory;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.ClientCategoryReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.jpa.ORMCommand;

public class ClientCategoryORMReadCommand extends ORMCommand implements ClientCategoryReadCommand {

	public ClientCategoryORMReadCommand(EntityManagerFactory entityManagerFactory) {
		super(entityManagerFactory);
	}

	@Override
	public ClientCategory searchForCategory(String categoryName) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		ClientCategory clientCategory = entityManager.find(ClientCategory.class, categoryName);
		entityManager.close();
		
		return clientCategory;
	}
	
	@Override
	public List<ClientCategory> getAllClientCategory() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String sql = "SELECT * FROM client_category";
		Query query = entityManager.createNativeQuery(sql, ClientCategory.class);
		List<ClientCategory> allClientCategory = query.getResultList();
		entityManager.close();

		return allClientCategory;
	}
}
