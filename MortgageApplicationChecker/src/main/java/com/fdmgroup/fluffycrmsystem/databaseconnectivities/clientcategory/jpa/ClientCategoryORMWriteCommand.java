package com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategory;
import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.ClientCategoryWriteCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.jpa.ORMCommand;

public class ClientCategoryORMWriteCommand extends ORMCommand implements ClientCategoryWriteCommand {

	public ClientCategoryORMWriteCommand(EntityManagerFactory entityManagerFactory) {
		super(entityManagerFactory);
	}

	@Override
	public boolean generateClientCategory(ClientCategory clientCategory) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		ClientCategory foundCategory = entityManager.find(ClientCategory.class, clientCategory.getCategoryName());
		if (foundCategory != null) {
			entityManager.close();
			return false;
		}

		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(clientCategory);
		entityTransaction.commit();

		entityManager.close();
		return true;
	}

	@Override
	public boolean assignClientToCategory(Client client, String categoryName) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ClientCategory foundClientCategory = entityManager.find(ClientCategory.class, categoryName);

		if (foundClientCategory == null) {
			entityManager.close();
			return false;
		}

		for (Client existedClient : foundClientCategory.getClients()) {
			if (existedClient.getId() == client.getId()) {
				entityManager.close();
				return false;
			}
		}

		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		foundClientCategory.addClient(client);
		entityTransaction.commit();

		entityManager.close();
		return true;
	}

	@Override
	public boolean removeClientFromCategory(int clientId, String categoryName) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ClientCategory foundClientCategory = entityManager.find(ClientCategory.class, categoryName);
		Client foundClient = entityManager.find(Client.class, clientId);

		if (foundClientCategory == null || foundClient == null) {
			entityManager.close();
			return false;
		}

		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		foundClientCategory.removeClient(foundClient);
		entityTransaction.commit();

		entityManager.close();
		return true;
	}
}
