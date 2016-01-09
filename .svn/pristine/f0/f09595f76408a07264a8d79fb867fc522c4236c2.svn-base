package com.fdmgroup.fluffycrmsystem.databaseconnectivities.client;

import java.util.List;

import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
import com.fdmgroup.fluffycrmsystem.transactionmanagement.Transaction;

public interface ClientReadCommand {
	
	public Client getClientById(int id);
	public List<Client> getClientByFirstName(String first);
	public List<Client> getClientByLastName(String last);
	public List<Client> getClientByOrg(String org);
	public List<Client> getAllClient();
	public List<Transaction> getClientTransactions(int clientId);
}
