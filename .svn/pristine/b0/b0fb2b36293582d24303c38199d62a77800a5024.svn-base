package com.fdmgroup.morgageapplicationchecker.controllers;

import javax.annotation.Resource;

import com.fdmgroup.morgageapplicationchecker.entities.CreditHistory;
import com.fdmgroup.morgageapplicationchecker.entitiesfactory.CreditHistoryFactory;
import com.fdmgroup.morgageapplicationchecker.readcmdinterfaces.CreditHistoryReadCommand;

public class CreditHistoryController {
	
	@Resource
	private CreditHistoryReadCommand readCmd;
	@Resource
	private CreditHistoryFactory factory;

	public CreditHistory getCreditHistoryByClientId(int clientId) {
		return readCmd.getCreditHistoryByClientId(clientId);
	}
}