package com.fdmgroup.fluffycrmsystem.controllers;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import static org.mockito.Mockito.*;

import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
import com.fdmgroup.fluffycrmsystem.clientmanagement.ClientFactory;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.ClientReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.ClientWriteCommand;

public class ClientControllerTest {

	private ClientController controller;
	private ClientReadCommand mockReadCmd;
	private ClientWriteCommand mockWriteCmd;
	private ClientFactory mockClientFactory;
	private int mockId;
	private String mockFirstName;
	private String mockLastName;
	private String mockPhone;
	private String mockAdress;
	private String mockOrg;
	private Calendar mockDoB;
	
	@Before
	public void setup() {
		mockReadCmd = mock(ClientReadCommand.class);
		mockWriteCmd = mock(ClientWriteCommand.class);
		mockClientFactory = mock(ClientFactory.class);
		controller = new ClientController(mockReadCmd, mockWriteCmd, mockClientFactory);
	}

	@Test
	public void test_registerClient() {
		// A
		Client mockClient = mock(Client.class);
		mockDoB = mock(Calendar.class);
		when(mockClientFactory.createClient(mockFirstName, mockLastName, mockPhone, mockAdress, mockOrg, mockDoB)).thenReturn(mockClient);
		// A
		controller.registerClient(mockFirstName, mockLastName, mockPhone, mockAdress, mockOrg, mockDoB);
		// A
		verify(mockWriteCmd, times(1)).registerClient(mockClient);
	}

	@Test
	public void test_getClientById() {
		// A
		// A
		controller.getClientById(mockId);
		// A
		verify(mockReadCmd, times(1)).getClientById(mockId);
	}
	
	@Test
	public void test_getClientByFirstName() {
		// A
		// A
		controller.getClientByFirstName(mockFirstName);
		// A
		verify(mockReadCmd, times(1)).getClientByFirstName(mockFirstName);
	}
	
	@Test
	public void test_getClientByLastName() {
		// A
		// A
		controller.getClientByLastName(mockLastName);
		// A
		verify(mockReadCmd, times(1)).getClientByLastName(mockLastName);
	}
	
	@Test
	public void test_getClientByOrg() {
		// A
		// A
		controller.getClientByOrg(mockOrg);
		// A
		verify(mockReadCmd, times(1)).getClientByOrg(mockOrg);
	}

	@Test
	public void test_getAllClients() {
		// A
		// A
		controller.getAllClient();
		// A
		verify(mockReadCmd, times(1)).getAllClient();
	}
	
	@Test
	public void test_getClientTransactions() {
		// A
		// A
		controller.getClientTransactions(mockId);
		// A
		verify(mockReadCmd, times(1)).getClientTransactions(mockId);
	}
}
