package com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.ClientWriteCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.jpa.ORMCommand;

public class ClientORMWriteCommand extends ORMCommand implements ClientWriteCommand {
	
	public ClientORMWriteCommand(EntityManagerFactory entityManagerFactory) {
		super(entityManagerFactory);
	}

	@Override
	public boolean registerClient(Client client) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(client);
		entityTransaction.commit();
		
		entityManager.close();
		return true;
	}
}
