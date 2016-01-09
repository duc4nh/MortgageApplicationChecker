package com.fdmgroup.morgageapplicationchecker.appconfig;

import java.util.List;

//import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fdmgroup.morgageapplicationchecker.controllers.AccountController;
import com.fdmgroup.morgageapplicationchecker.controllers.ClientController;
import com.fdmgroup.morgageapplicationchecker.controllers.CreditHistoryController;

public class Runner {
	public static void main(String[] args) {
		//PropertyConfigurator.configure("log4j.properties");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		final AccountController accountController = context.getBean(AccountController.class);
		final ClientController clientController = context.getBean(ClientController.class);
		final CreditHistoryController creditHistoryController = context.getBean(CreditHistoryController.class);
		
		System.out.println(accountController.getAccountsById(2, "current").get(0).getBalanceQ1());
		System.out.println(clientController.getClientById(1).getFirstName());
		System.out.println(creditHistoryController.getCreditHistoryByClientId(1).getFicoScore());
		System.out.println(clientController.getClientById(3).getAccounts().get(0).getId());
		
	}
}
