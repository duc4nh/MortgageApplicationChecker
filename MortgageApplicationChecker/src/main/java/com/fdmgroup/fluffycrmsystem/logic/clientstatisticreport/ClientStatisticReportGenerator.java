package com.fdmgroup.fluffycrmsystem.logic.clientstatisticreport;

import java.util.Calendar;
import java.util.List;

import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;

public class ClientStatisticReportGenerator {

	private ClientStatisticReportFactory reportFactory;

	public ClientStatisticReportGenerator(ClientStatisticReportFactory reportFactory) {
		this.reportFactory = reportFactory;
	}

	public ClientStatisticReport generateReport(List<Client> clients, int numberOfTransaction, double totalSpend) {
		int numberOfClient = clients.size();
		int sumAge = 0;

		double averageSpend = 0;
		double averageAge = 0;
		double averageOfTransaction = 0;

		for (Client client : clients) {
			sumAge += Calendar.getInstance().get(Calendar.YEAR) - client.getDob().get(Calendar.YEAR);
		}

		if (numberOfTransaction != 0) {
			averageSpend = totalSpend / numberOfTransaction;
		}

		if (numberOfClient != 0) {
			averageAge = (double) sumAge / numberOfClient;
			averageOfTransaction = (double) numberOfTransaction / numberOfClient;
		}

		return reportFactory.createReport(numberOfClient, totalSpend, averageSpend, averageAge, numberOfTransaction, averageOfTransaction);
	}
}
