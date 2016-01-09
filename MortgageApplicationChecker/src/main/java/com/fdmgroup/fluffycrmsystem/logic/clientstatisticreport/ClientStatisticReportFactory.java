package com.fdmgroup.fluffycrmsystem.logic.clientstatisticreport;

public class ClientStatisticReportFactory {

	public ClientStatisticReport createReport(int numberOfClient, double totalSpend, double averageSpend, double averageAge, int numberOfTransaction, double averageOfTransaction) {
		ClientStatisticReport report = new ClientStatisticReport();
		report.setNumberOfClient(numberOfClient);
		report.setTotalSpend(totalSpend);
		report.setAverageSpend(averageSpend);
		report.setAverageAge(averageAge);
		report.setNumberOfTransaction(numberOfTransaction);
		report.setAverageOfTransaction(averageOfTransaction);

		return report;
	}
}
