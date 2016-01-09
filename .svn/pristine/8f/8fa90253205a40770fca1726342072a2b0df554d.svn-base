package com.fdmgroup.fluffycrmsystem.logic.clientstatisticreport;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClientStatisticReportFactoryTest {

	private ClientStatisticReportFactory factory;
	private int numberOfClient;
	private double totalSpend;
	private double averageSpend;
	private double averageAge;
	private int numberOfTransaction;
	private double averageOfTransaction;
	
	@Before
	public void setup() {
		factory = new ClientStatisticReportFactory();
	}
	
	@Test
	public void test_createReport_ReturnClientStatisticReport() {
		// A
		// A
		ClientStatisticReport report = factory.createReport(numberOfClient, totalSpend, averageSpend, averageAge, numberOfTransaction, averageOfTransaction);
		// A
		assertTrue(report instanceof ClientStatisticReport);
	}
}
