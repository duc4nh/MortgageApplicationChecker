package com.fdmgroup.fluffycrmsystem.controllers;

import java.util.Calendar;
import java.util.List;

import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
import com.fdmgroup.fluffycrmsystem.clientmanagement.ClientFactory;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.ClientReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.ClientWriteCommand;
import com.fdmgroup.fluffycrmsystem.transactionmanagement.Transaction;

public class ClientController {
	
	private ClientReadCommand readCmd;
	private ClientWriteCommand writeCmd;
	private ClientFactory clientFactory;

	public ClientController(ClientReadCommand readCmd, ClientWriteCommand writeCmd, ClientFactory clientFactory) {
		this.readCmd = readCmd;
		this.writeCmd = writeCmd;
		this.clientFactory = clientFactory;
	}

	public boolean registerClient(String firstName, String lastName, String phoneNumber, String address, String organisation, Calendar dob) {
		return writeCmd.registerClient(clientFactory.createClient(firstName, lastName, phoneNumber, address, organisation, dob));
	}
	
	public Client getClientById(int id) {
		return readCmd.getClientById(id);
	}
	
	public List<Client> getClientByFirstName(String first) {
		return readCmd.getClientByFirstName(first);
	}
	
	public List<Client> getClientByLastName(String last) {
		return readCmd.getClientByLastName(last);
	}

	public List<Client> getClientByOrg(String org) {
		return readCmd.getClientByOrg(org);
	}
	
	public List<Client> getAllClient() {
		return readCmd.getAllClient();
	}
	
	public List<Transaction> getClientTransactions(int clientId) {
		return readCmd.getClientTransactions(clientId);
	}
}