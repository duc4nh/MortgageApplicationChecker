package com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.ClientReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.jpa.ORMCommand;
import com.fdmgroup.fluffycrmsystem.transactionmanagement.Transaction;

public class ClientORMReadCommand extends ORMCommand implements ClientReadCommand {

	public ClientORMReadCommand(EntityManagerFactory entityManagerFactory) {
		super(entityManagerFactory);
	}

	@Override
	public Client getClientById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Client client = entityManager.find(Client.class, id);
		entityManager.close();
		return client;
	}

	@Override
	public List<Client> getAllClient() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT * FROM clients";
		Query query = entityManager.createNativeQuery(sql, Client.class);
		List<Client> allClients = query.getResultList();
		
		entityManager.close();
		return allClients;
	}

	@Override
	public List<Client> getClientByFirstName(String first) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT * FROM clients WHERE first_name LIKE :para";
		Query query = entityManager.createNativeQuery(sql, Client.class);
		query.setParameter("para", first);
		List<Client> allClients = query.getResultList();
		
		entityManager.close();
		return allClients;
	}

	@Override
	public List<Client> getClientByLastName(String last) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT * FROM clients WHERE last_name LIKE :para";
		Query query = entityManager.createNativeQuery(sql, Client.class);
		query.setParameter("para", last);
		List<Client> allClients = query.getResultList();
		
		entityManager.close();
		return allClients;
	}

	@Override
	public List<Client> getClientByOrg(String org) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT * FROM clients WHERE organisation LIKE :para";
		Query query = entityManager.createNativeQuery(sql, Client.class);
		query.setParameter("para", org);
		List<Client> allClients = query.getResultList();
		
		entityManager.close();
		return allClients;
	}

	@Override
	public List<Transaction> getClientTransactions(int clientId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT * FROM transactions WHERE client_id= :id";
		Query query = entityManager.createNativeQuery(sql, Transaction.class);
		query.setParameter("id", clientId);
		
		List<Transaction> allTransactions = query.getResultList();
		
		entityManager.close();
		return allTransactions;
	}
}
