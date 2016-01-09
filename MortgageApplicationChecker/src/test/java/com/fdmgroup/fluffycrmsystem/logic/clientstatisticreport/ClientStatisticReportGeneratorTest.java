package com.fdmgroup.fluffycrmsystem.logic.clientstatisticreport;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;

public class ClientStatisticReportGeneratorTest {

	private ClientStatisticReportFactory mockReportFactory;
	private ClientStatisticReportGenerator reportGenerator;
	private List<Client> mockClients;
	private int numberOfTransaction;
	private double totalSpend;
	private Client mockClient;
	private ClientStatisticReport mockReport;
	
	@Before
	public void setup() {
		mockReportFactory = mock(ClientStatisticReportFactory.class);
		reportGenerator = new ClientStatisticReportGenerator(mockReportFactory);
		
		mockClient = mock(Client.class);
		when(mockClient.getDob()).thenReturn(Calendar.getInstance());
		
		mockClients = Arrays.asList(mockClient, mockClient, mockClient);
	}
	
	@Test
	public void test_generateReport_GetClientDOB3Times() {
		// A
		// A
		ClientStatisticReport report = reportGenerator.generateReport(mockClients, numberOfTransaction, totalSpend);
		// A
		verify(mockClient, times(3)).getDob();
	}
	
	@Test
	public void test_generateReport_ReturnClientStatisticReport() {
		// A
		mockReport = mock(ClientStatisticReport.class);
		when(mockReportFactory.createReport(anyInt(), anyDouble(), anyDouble(), anyDouble(), anyInt(), anyDouble())).thenReturn(mockReport);
		// A
		ClientStatisticReport report = reportGenerator.generateReport(mockClients, numberOfTransaction, totalSpend);
		// A
		assertTrue(report instanceof ClientStatisticReport);
	}
}
