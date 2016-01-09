package com.fdmgroup.fluffycrmsystem.controllers;

import java.util.List;

import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
import com.fdmgroup.fluffycrmsystem.logic.clientstatisticreport.ClientStatisticReport;
import com.fdmgroup.fluffycrmsystem.logic.clientstatisticreport.ClientStatisticReportGenerator;

public class ClientStatisticReportController {

	private ClientStatisticReportGenerator reportGenerator;
	
	public ClientStatisticReportController(ClientStatisticReportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}
	
	public ClientStatisticReport generateReport(List<Client> clients, int numberOfTransaction, double totalSpend) {
		return reportGenerator.generateReport(clients, numberOfTransaction, totalSpend);
	}
}
