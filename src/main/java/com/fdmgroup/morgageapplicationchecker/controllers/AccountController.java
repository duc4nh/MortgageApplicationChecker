package com.fdmgroup.morgageapplicationchecker.controllers;

import java.util.List;

import javax.annotation.Resource;

import com.fdmgroup.morgageapplicationchecker.entities.Account;
import com.fdmgroup.morgageapplicationchecker.entitiesfactory.AccountFactory;
import com.fdmgroup.morgageapplicationchecker.readcmdinterfaces.AccountReadCommand;

public class AccountController {
	
	@Resource
	private AccountReadCommand readCmd;
	@Resource
	private AccountFactory factory;

	public List<Account> getAccountsById(int clientId, String type) {
		return readCmd.getAccountsByClientId(clientId, type);
	}
}
