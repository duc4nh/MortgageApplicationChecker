package com.fdmgroup.morgageapplicationchecker.ormreadcmd;

import javax.persistence.EntityManager;

import com.fdmgroup.morgageapplicationchecker.entities.Client;
import com.fdmgroup.morgageapplicationchecker.readcmdinterfaces.ClientReadCommand;

public class ClientORMReadCommand extends ORMCommand implements ClientReadCommand {

	@Override
	public Client getClientById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Client client = entityManager.find(Client.class, id);
		entityManager.close();
		return client;
	}
}
