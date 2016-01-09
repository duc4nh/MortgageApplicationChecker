package com.fdmgroup.morgageapplicationchecker.appconfig;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fdmgroup.morgageapplicationchecker.controllers.AccountController;
import com.fdmgroup.morgageapplicationchecker.controllers.ClientController;
import com.fdmgroup.morgageapplicationchecker.controllers.CreditHistoryController;
import com.fdmgroup.morgageapplicationchecker.entitiesfactory.AccountFactory;
import com.fdmgroup.morgageapplicationchecker.entitiesfactory.ClientFactory;
import com.fdmgroup.morgageapplicationchecker.entitiesfactory.CreditHistoryFactory;
import com.fdmgroup.morgageapplicationchecker.ormreadcmd.AccountORMReadCommand;
import com.fdmgroup.morgageapplicationchecker.ormreadcmd.ClientORMReadCommand;
import com.fdmgroup.morgageapplicationchecker.ormreadcmd.CreditHistoryORMReadCommand;
import com.fdmgroup.morgageapplicationchecker.readcmdinterfaces.AccountReadCommand;
import com.fdmgroup.morgageapplicationchecker.readcmdinterfaces.ClientReadCommand;
import com.fdmgroup.morgageapplicationchecker.readcmdinterfaces.CreditHistoryReadCommand;

@Configuration
public class AppConfig {

	@Bean
	public AccountController createAccountController() {
		return new AccountController();
	}

	@Bean
	public ClientController createClientController() {
		return new ClientController();
	}
	
	@Bean
	public CreditHistoryController createCreditHistoryController() {
		return new CreditHistoryController();
	}
	
	@Bean
	public AccountFactory createAccountFactory() {
		return new AccountFactory();
	}

	@Bean
	public ClientFactory createClientFactory() {
		return new ClientFactory();
	}
	
	@Bean
	public CreditHistoryFactory createCreditHistoryFactory() {
		return new CreditHistoryFactory();
	}
	
	@Bean
	public AccountReadCommand createAccountReadCommand() {
		return new AccountORMReadCommand();
	}

	@Bean
	public ClientReadCommand createClientReadCommand() {
		return new ClientORMReadCommand();
	}
	
	@Bean
	public CreditHistoryReadCommand createCreditHistoryReadCommand() {
		return new CreditHistoryORMReadCommand();
	}
	
	@Bean
	public EntityManagerFactory createEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("persistenceunit");
	}
}