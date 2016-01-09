package com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.jpa;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.client.jpa.ClientORMWriteCommand;

public class ClientORMWriteCommandTest {

	private ClientORMWriteCommand clientORMWriteCommand;
	private EntityManagerFactory mockEntityManagerFactory;
	private Client mockClient;
	private EntityManager mockEntityManager;
	private EntityTransaction mockEntityTransaction;
	
	@Before
	public void setup() {
		mockEntityManagerFactory = mock(EntityManagerFactory.class);
		clientORMWriteCommand = new ClientORMWriteCommand(mockEntityManagerFactory);
		
		mockEntityManager = mock(EntityManager.class);
		when(mockEntityManagerFactory.createEntityManager()).thenReturn(mockEntityManager);
		mockEntityTransaction = mock(EntityTransaction.class);
		when(mockEntityManager.getTransaction()).thenReturn(mockEntityTransaction);
	}
	
	@Test
	public void test_write_createEntityManager() {
		//A
		//A
		clientORMWriteCommand.registerClient(mockClient);
		//A
		verify(mockEntityManagerFactory, times(1)).createEntityManager();
	}
	
	@Test
	public void test_write_createEntityTransaction() {
		//A
		//A
		clientORMWriteCommand.registerClient(mockClient);
		//A
		verify(mockEntityManager, times(1)).getTransaction();
	}
	
	@Test
	public void test_write_TransactionBegin() {
		//A
		//A
		clientORMWriteCommand.registerClient(mockClient);
		//A
		verify(mockEntityTransaction, times(1)).begin();
	}
	
	@Test
	public void test_write_TransactionCommit() {
		//A
		//A
		clientORMWriteCommand.registerClient(mockClient);
		//A
		verify(mockEntityTransaction, times(1)).commit();
	}
	
	@Test
	public void test_write_persistEntityManager() {
		//A
		//A
		clientORMWriteCommand.registerClient(mockClient);
		//A
		verify(mockEntityManager, times(1)).persist(mockClient);
	}
	
	@Test
	public void test_write_closeEntityManager() {
		//A
		//A
		clientORMWriteCommand.registerClient(mockClient);
		//A
		verify(mockEntityManager, times(1)).close();
	}
}
