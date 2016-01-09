package com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.jpa;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.jpa.ClientORMReadCommand;
import com.fdmgroup.fluffycrmsystem.transactionmanagement.Transaction;

public class ClientORMReadCommandTest {
	private ClientORMReadCommand clientORMReadCommand;
	private EntityManagerFactory mockEntityManagerFactory;
	private EntityManager mockEntityManager;
	private Query mockQuery;
	private List<?> mockList;
	private int mockId;
	private String mockName;
	
	@Before
	public void setup() {
		mockEntityManagerFactory = mock(EntityManagerFactory.class);
		clientORMReadCommand = new ClientORMReadCommand(mockEntityManagerFactory);
		
		mockEntityManager = mock(EntityManager.class);
		when(mockEntityManagerFactory.createEntityManager()).thenReturn(mockEntityManager);
		
		mockQuery = mock(Query.class);
		when(mockEntityManager.createNativeQuery(anyString(), eq(Client.class))).thenReturn(mockQuery);
		when(mockEntityManager.createNativeQuery(anyString(), eq(Transaction.class))).thenReturn(mockQuery);
		
		mockList = mock(List.class);
		when(mockQuery.getResultList()).thenReturn(mockList);
	}

	@Test
	public void test_getClientById_returnAnUser() {
		// A
		Client mockClient = mock(Client.class);
		when(mockEntityManager.find(eq(Client.class), anyInt())).thenReturn(mockClient);
		// A
		Client client = clientORMReadCommand.getClientById(mockId);
		// A
		assertTrue(client instanceof Client);
	}
	
	@Test
	public void test_getClientById_createEntityManager() {
		// A
		// A
		clientORMReadCommand.getClientById(mockId);
		// A
		verify(mockEntityManagerFactory, times(1)).createEntityManager();
	}

	@Test
	public void test_getClientById_findClient() {
		// A
		// A
		clientORMReadCommand.getClientById(mockId);
		// A
		verify(mockEntityManager, times(1)).find(Client.class, mockId);
	}

	@Test
	public void test_getClientById_closeEntityManager() {
		// A
		// A
		clientORMReadCommand.getClientById(mockId);
		// A
		verify(mockEntityManager, times(1)).close();
	}
	
	@Test
	public void test_getAllClient_returnList() {
		// A
		// A
		List<Client> clients = clientORMReadCommand.getAllClient();
		// A
		assertTrue(clients instanceof List<?>);
	}
	
	@Test
	public void test_getAllClient_createEntityManager() {
		// A
		// A
		clientORMReadCommand.getAllClient();
		// A
		verify(mockEntityManagerFactory, times(1)).createEntityManager();
	}

	@Test
	public void test_getAllClient_createNativeQuery() {
		// A
		String sql = "SELECT * FROM clients";
		// A
		clientORMReadCommand.getAllClient();
		// A
		verify(mockEntityManager, times(1)).createNativeQuery(sql, Client.class);
	}
	
	@Test
	public void test_getAllClient_getResultList() {
		// A
		// A
		clientORMReadCommand.getAllClient(); 
		// A
		verify(mockQuery, times(1)).getResultList();
	}
	
	@Test
	public void test_getAllClient_closeEntityManager() {
		// A
		// A
		clientORMReadCommand.getAllClient();
		// A
		verify(mockEntityManager, times(1)).close();
	}
	
	@Test
	public void test_getClientByFirstName_returnList() {
		// A
		// A
		List<Client> clients = clientORMReadCommand.getClientByFirstName(mockName);
		// A
		assertTrue(clients instanceof List<?>);
	}
	
	@Test
	public void test_getClientByFirstName_createEntityManager() {
		// A
		// A
		clientORMReadCommand.getClientByFirstName(mockName);
		// A
		verify(mockEntityManagerFactory, times(1)).createEntityManager();
	}

	@Test
	public void test_getClientByFirstName_createNativeQuery() {
		// A
		String sql = "SELECT * FROM clients WHERE first_name LIKE :para";
		// A
		clientORMReadCommand.getClientByFirstName(mockName);
		// A
		verify(mockEntityManager, times(1)).createNativeQuery(sql, Client.class);
	}

	@Test
	public void test_getClientByFirstName_setParameter() {
		// A
		// A
		clientORMReadCommand.getClientByFirstName(mockName);
		// A
		verify(mockQuery, times(1)).setParameter("para", mockName);
	}
	
	@Test
	public void test_getClientByFirstName_getResultList() {
		// A
		// A
		clientORMReadCommand.getClientByFirstName(mockName); 
		// A
		verify(mockQuery, times(1)).getResultList();
	}
	
	@Test
	public void test_getClientByFirstName_closeEntityManager() {
		// A
		// A
		clientORMReadCommand.getClientByFirstName(mockName);
		// A
		verify(mockEntityManager, times(1)).close();
	}
	
	@Test
	public void test_getClientByLastName_returnList() {
		// A
		// A
		List<Client> clients = clientORMReadCommand.getClientByLastName(mockName);
		// A
		assertTrue(clients instanceof List<?>);
	}
	
	@Test
	public void test_getClientByLastName_createEntityManager() {
		// A
		// A
		clientORMReadCommand.getClientByLastName(mockName);
		// A
		verify(mockEntityManagerFactory, times(1)).createEntityManager();
	}

	@Test
	public void test_getClientByLastName_createNativeQuery() {
		// A
		String sql = "SELECT * FROM clients WHERE last_name LIKE :para";
		// A
		clientORMReadCommand.getClientByLastName(mockName);
		// A
		verify(mockEntityManager, times(1)).createNativeQuery(sql, Client.class);
	}

	@Test
	public void test_getClientByLastName_setParameter() {
		// A
		// A
		clientORMReadCommand.getClientByLastName(mockName);
		// A
		verify(mockQuery, times(1)).setParameter("para", mockName);
	}
	
	@Test
	public void test_getClientByLastName_getResultList() {
		// A
		// A
		clientORMReadCommand.getClientByLastName(mockName); 
		// A
		verify(mockQuery, times(1)).getResultList();
	}
	
	@Test
	public void test_getClientByLastName_closeEntityManager() {
		// A
		// A
		clientORMReadCommand.getClientByLastName(mockName);
		// A
		verify(mockEntityManager, times(1)).close();
	}
	
	@Test
	public void test_getClientByOrg_returnList() {
		// A
		// A
		List<Client> clients = clientORMReadCommand.getClientByOrg(mockName);
		// A
		assertTrue(clients instanceof List<?>);
	}
	
	@Test
	public void test_getClientByOrg_createEntityManager() {
		// A
		// A
		clientORMReadCommand.getClientByOrg(mockName);
		// A
		verify(mockEntityManagerFactory, times(1)).createEntityManager();
	}

	@Test
	public void test_getClientByOrg_createNativeQuery() {
		// A
		String sql = "SELECT * FROM clients WHERE organisation LIKE :para";
		// A
		clientORMReadCommand.getClientByOrg(mockName);
		// A
		verify(mockEntityManager, times(1)).createNativeQuery(sql, Client.class);
	}

	@Test
	public void test_getClientByOrg_setParameter() {
		// A
		// A
		clientORMReadCommand.getClientByOrg(mockName);
		// A
		verify(mockQuery, times(1)).setParameter("para", mockName);
	}
	
	@Test
	public void test_getClientByOrg_getResultList() {
		// A
		// A
		clientORMReadCommand.getClientByOrg(mockName); 
		// A
		verify(mockQuery, times(1)).getResultList();
	}
	
	@Test
	public void test_getClientByOrg_closeEntityManager() {
		// A
		// A
		clientORMReadCommand.getClientByOrg(mockName);
		// A
		verify(mockEntityManager, times(1)).close();
	}
	
	@Test
	public void test_getClientTransactions_returnList() {
		// A
		// A
		List<Transaction> transactions = clientORMReadCommand.getClientTransactions(mockId);
		// A
		assertTrue(transactions instanceof List<?>);
	}
	
	@Test
	public void test_getClientTransactions_createEntityManager() {
		// A
		// A
		clientORMReadCommand.getClientTransactions(mockId);
		// A
		verify(mockEntityManagerFactory, times(1)).createEntityManager();
	}

	@Test
	public void test_getClientTransactions_createNativeQuery() {
		// A
		String sql = "SELECT * FROM transactions WHERE client_id= :id";
		// A
		clientORMReadCommand.getClientTransactions(mockId);
		// A
		verify(mockEntityManager, times(1)).createNativeQuery(sql, Transaction.class);
	}

	@Test
	public void test_getClientTransactions_setParameter() {
		// A
		// A
		clientORMReadCommand.getClientTransactions(mockId);
		// A
		verify(mockQuery, times(1)).setParameter("id", mockId);
	}
	
	@Test
	public void test_getClientTransactions_getResultList() {
		// A
		// A
		clientORMReadCommand.getClientTransactions(mockId); 
		// A
		verify(mockQuery, times(1)).getResultList();
	}
	
	@Test
	public void test_getClientTransactions_closeEntityManager() {
		// A
		// A
		clientORMReadCommand.getClientTransactions(mockId);
		// A
		verify(mockEntityManager, times(1)).close();
	}
}
