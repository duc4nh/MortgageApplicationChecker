package com.fdmgroup.fluffycrmsystem.logic.clientstatisticreport;

public class ClientStatisticReport {
	
	private int numberOfClient;
	private double totalSpend;
	private double averageSpend;
	private double averageAge;
	private int numberOfTransaction;
	private double averageOfTransaction;
	
	public int getNumberOfClient() {
		return numberOfClient;
	}
	public void setNumberOfClient(int numberOfClient) {
		this.numberOfClient = numberOfClient;
	}
	public double getTotalSpend() {
		return totalSpend;
	}
	public void setTotalSpend(double totalSpend) {
		this.totalSpend = totalSpend;
	}
	public double getAverageSpend() {
		return averageSpend;
	}
	public void setAverageSpend(double averageSpend) {
		this.averageSpend = averageSpend;
	}
	public double getAverageAge() {
		return averageAge;
	}
	public void setAverageAge(double averageAge) {
		this.averageAge = averageAge;
	}
	public int getNumberOfTransaction() {
		return numberOfTransaction;
	}
	public void setNumberOfTransaction(int numberOfTransaction) {
		this.numberOfTransaction = numberOfTransaction;
	}
	public double getAverageOfTransaction() {
		return averageOfTransaction;
	}
	public void setAverageOfTransaction(double averageOfTransaction) {
		this.averageOfTransaction = averageOfTransaction;
	}
}
