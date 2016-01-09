package com.fdmgroup.morgageapplicationchecker.controllers;

import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import com.fdmgroup.morgageapplicationchecker.entities.Client;
import com.fdmgroup.morgageapplicationchecker.entitiesfactory.ClientFactory;
import com.fdmgroup.morgageapplicationchecker.readcmdinterfaces.ClientReadCommand;

public class ClientController {
	
	@Resource
	private ClientReadCommand readCmd;
	@Resource
	private ClientFactory factory;

	public Client getClientById(int id) {
		return readCmd.getClientById(id);
	}
}