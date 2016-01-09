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
public class AccountChartServlet {

	@Resource
	private ClientController clientController;
	@Resource
	private AccountController accountController ;

	
	@RequestMapping(value = "/protected/chart", method = RequestMethod.GET)
	public String searchforclient(Model model, @RequestParam("clientId") int clientId, @RequestParam("type") String type, @RequestParam("accountId") int accountId )
	{
		Client client = clientController.getClientById(clientId) ;
		for (Account account : client.getAccounts()) {
			if (account.getId() == accountId) {
				model.addAttribute("q1", account.getBalanceQ1());
				model.addAttribute("q2", account.getBalanceQ2());
				model.addAttribute("q3", account.getBalanceQ3());
				model.addAttribute("q4", account.getBalanceQ4());
				break;
			}
		}
		
		model.addAttribute("type", type);
		model.addAttribute("accountId", accountId);
		model.addAttribute("clientId", clientId);
		return "chart" ;
	}
}
