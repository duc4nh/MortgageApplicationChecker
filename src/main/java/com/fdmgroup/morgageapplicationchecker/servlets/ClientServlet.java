package com.fdmgroup.morgageapplicationchecker.servlets;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.morgageapplicationchecker.controllers.AccountController;
import com.fdmgroup.morgageapplicationchecker.controllers.ClientController;
import com.fdmgroup.morgageapplicationchecker.entities.Account;
import com.fdmgroup.morgageapplicationchecker.entities.Client;
import com.fdmgroup.morgageapplicationchecker.entities.CreditHistory;

@Controller
public class ClientServlet {

	@Resource
	private ClientController clientController;
	@Resource
	private AccountController accountController ;

	
	@RequestMapping(value = "/protected/searchforclient2", method = RequestMethod.GET)
	public String searchforclient(Model model, @RequestParam("clientId") int clientId )
	{
		Client client = clientController.getClientById(clientId) ;
		CreditHistory creditId = client.getCreditHistory();
		model.addAttribute("client", client);		
		model.addAttribute("CreditId", creditId);
		return "searchforclient2" ;
	}

	@RequestMapping(value="/protected/searchforclient", method =RequestMethod.GET)
	public String searchforclient (Model model)
	{
		return "searchforclient";
	}
	
	@RequestMapping (value="/protected/searchforaccount", method = RequestMethod.GET)
	public String  searchforaccount (Model model)
	{
		return "searchforaccount";
	}
	
	@RequestMapping (value="/protected/searchforaccount2", method = RequestMethod.GET)
	public String searchforaccount (Model model, @RequestParam ("clientId") int clientId)
	{
		Client client = clientController.getClientById(clientId) ;
		List<Account> accounts = client.getAccounts();
		model.addAttribute("client", client) ;
		model.addAttribute("accounts", accounts) ;
		return "searchforaccount2";
	}
}
