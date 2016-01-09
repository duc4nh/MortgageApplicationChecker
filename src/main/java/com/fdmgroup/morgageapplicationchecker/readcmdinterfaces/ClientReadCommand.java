package com.fdmgroup.morgageapplicationchecker.readcmdinterfaces;

import com.fdmgroup.morgageapplicationchecker.entities.Client;

public interface ClientReadCommand {

	public Client getClientById(int id);

}
