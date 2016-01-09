package com.fdmgroup.morgageapplicationchecker.ormreadcmd;

import javax.persistence.EntityManager;

import com.fdmgroup.morgageapplicationchecker.entities.Client;
import com.fdmgroup.morgageapplicationchecker.entities.CreditHistory;
import com.fdmgroup.morgageapplicationchecker.readcmdinterfaces.CreditHistoryReadCommand;

public class CreditHistoryORMReadCommand extends ORMCommand implements CreditHistoryReadCommand {

	@Override
	public CreditHistory getCreditHistoryByClientId(int clientId) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Client client = entityManager.find(Client.class, clientId);
		CreditHistory creditHistory = client.getCreditHistory();
		entityManager.close();
		return creditHistory;
	}
}
