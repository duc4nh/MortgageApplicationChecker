package com.fdmgroup.fluffycrmsystem.clientmanagement;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
import com.fdmgroup.fluffycrmsystem.clientmanagement.ClientFactory;

public class ClientFactoryTest {
	
	private ClientFactory factory;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	private String organisation;
	private Calendar dob;
	
	@Before
	public void setup() {
		factory = new ClientFactory();
	}
	
	@Test
	public void test_createClient_ReturnClient() {
		// A
		// A
		Client client = factory.createClient(firstName, lastName, phoneNumber, address, organisation, dob);
		// A
		assertTrue(client instanceof Client);
	}
}
