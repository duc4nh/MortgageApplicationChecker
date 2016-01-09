package com.fdmgroup.morgageapplicationchecker.ormreadcmd;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.fdmgroup.morgageapplicationchecker.entities.Account;
import com.fdmgroup.morgageapplicationchecker.entities.Client;
import com.fdmgroup.morgageapplicationchecker.readcmdinterfaces.AccountReadCommand;

public class AccountORMReadCommand extends ORMCommand implements AccountReadCommand {

	@Override
	public List<Account> getAccountsByClientId(int clientId, String type) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Client client = entityManager.find(Client.class, clientId);

		List<Account> listOfAccounts = client.getAccounts();
		List<Account> selectedTypeOfAccountList = new ArrayList<Account>();

		for (int i = 0; i < listOfAccounts.size(); i++) {
			if (listOfAccounts.get(i).getType().equals(type)) {
				selectedTypeOfAccountList.add(listOfAccounts.get(i));
			}
		}

		entityManager.close();
		return selectedTypeOfAccountList;
	}
}
