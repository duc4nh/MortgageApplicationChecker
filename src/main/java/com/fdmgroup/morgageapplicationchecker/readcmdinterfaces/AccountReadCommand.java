package com.fdmgroup.morgageapplicationchecker.readcmdinterfaces;

import java.util.List;

import com.fdmgroup.morgageapplicationchecker.entities.Account;

public interface AccountReadCommand {
	
	public List<Account> getAccountsByClientId(int clientId, String type);
}
