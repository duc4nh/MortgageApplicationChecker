package com.fdmgroup.fluffycrmsystem.controllers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
import com.fdmgroup.fluffycrmsystem.logic.clientstatisticreport.ClientStatisticReport;
import com.fdmgroup.fluffycrmsystem.logic.clientstatisticreport.ClientStatisticReportGenerator;

public class ClientStatisticReportControllerTest {

	private ClientStatisticReportController reportController;
	private ClientStatisticReportGenerator mockReportGenerator;
	private List<Client> clients;
	private int numberOfTransaction;
	private double totalSpend;
	
	@Before
	public void setup() {
		mockReportGenerator = mock(ClientStatisticReportGenerator.class);
		reportController = new ClientStatisticReportController(mockReportGenerator);
	}
	
	@Test
	public void test_generateReport() {
		// A
		// A
		reportController.generateReport(clients, numberOfTransaction, totalSpend);
		// A
		verify(mockReportGenerator, times(1)).generateReport(clients, numberOfTransaction, totalSpend);
	}
	
	@Test
	public void test_generateReport_ReturnClientStatisticReport() {
		// A
		ClientStatisticReport mockReport = mock(ClientStatisticReport.class);
		when(mockReportGenerator.generateReport(clients, numberOfTransaction, totalSpend)).thenReturn(mockReport);
		// A
		ClientStatisticReport report = mockReportGenerator.generateReport(clients, numberOfTransaction, totalSpend);
		// A
		assertTrue(report instanceof ClientStatisticReport);
	}
}
