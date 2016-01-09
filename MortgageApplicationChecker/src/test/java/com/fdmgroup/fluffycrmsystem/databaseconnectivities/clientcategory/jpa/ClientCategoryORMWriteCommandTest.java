package com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.jpa;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategory;
import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;

public class ClientCategoryORMWriteCommandTest {

	private ClientCategoryORMWriteCommand clientCategoryORMWriteCommand;
	private EntityManagerFactory mockEntityManagerFactory;
	private ClientCategory mockClientCategory;
	private Client mockClient;
	private String mockCategoryName;
	private int mockId;

	private EntityManager mockEntityManager;
	private EntityTransaction mockEntityTransaction;

	@Before
	public void setup() {
		mockEntityManagerFactory = mock(EntityManagerFactory.class);
		clientCategoryORMWriteCommand = new ClientCategoryORMWriteCommand(mockEntityManagerFactory);

		mockEntityManager = mock(EntityManager.class);
		when(mockEntityManagerFactory.createEntityManager()).thenReturn(mockEntityManager);
		
		mockClientCategory = mock(ClientCategory.class);
		mockClient = mock(Client.class);
		
		mockEntityTransaction = mock(EntityTransaction.class);
		when(mockEntityManager.getTransaction()).thenReturn(mockEntityTransaction);
	}

	@Test
	public void test_generateClientCategory_createEntityManager() {
		// A
		// A
		clientCategoryORMWriteCommand.generateClientCategory(mockClientCategory);
		// A
		verify(mockEntityManagerFactory, times(1)).createEntityManager();
	}
	
	@Test
	public void test_generateClientCategory_EntityManagerFind() {
		// A
		// A
		clientCategoryORMWriteCommand.generateClientCategory(mockClientCategory);
		// A
		verify(mockEntityManager, times(1)).find(eq(ClientCategory.class), anyString());
	}
	
	@Test
	public void test_generateClientCategory_returnFalse_IfCategoryNameExists() {
		// A
		when(mockEntityManager.find(eq(ClientCategory.class), anyString())).thenReturn(mockClientCategory);
		// A
		boolean value = clientCategoryORMWriteCommand.generateClientCategory(mockClientCategory);
		// A
		assertFalse(value);
	}
	
	@Test
	public void test_generateClientCategory_closeEntityManager_IfCategoryNameExists() {
		// A
		when(mockEntityManager.find(eq(ClientCategory.class), anyString())).thenReturn(mockClientCategory);
		// A
		clientCategoryORMWriteCommand.generateClientCategory(mockClientCategory);
		// A
		verify(mockEntityManager, times(1)).close();
	}

	@Test
	public void test_generateClientCategory_createEntityTransaction_IfCategoryNameNotExists() {
		// A
		// A
		clientCategoryORMWriteCommand.generateClientCategory(mockClientCategory);
		// A
		verify(mockEntityManager, times(1)).getTransaction();
	}
	
	@Test
	public void test_generateClientCategory_TransactionBegin_IfCategoryNameNotExists() {
		// A
		// A
		clientCategoryORMWriteCommand.generateClientCategory(mockClientCategory);
		// A
		verify(mockEntityTransaction, times(1)).begin();
	}

	@Test
	public void test_generateClientCategory_TransactionCommit_IfCategoryNameNotExists() {
		// A
		// A
		clientCategoryORMWriteCommand.generateClientCategory(mockClientCategory);
		// A
		verify(mockEntityTransaction, times(1)).commit();
	}

	@Test
	public void test_generateClientCategory_persistEntityManager_IfCategoryNameNotExists() {
		// A
		// A
		clientCategoryORMWriteCommand.generateClientCategory(mockClientCategory);
		// A
		verify(mockEntityManager, times(1)).persist(mockClientCategory);
	}

	@Test
	public void test_generateClientCategory_closeEntityManager_IfCategoryNameNotExists() {
		// A
		// A
		clientCategoryORMWriteCommand.generateClientCategory(mockClientCategory);
		// A
		verify(mockEntityManager, times(1)).close();
	}

	@Test
	public void test_assignClientToCategory_createEntityManager() {
		// A
		// A
		clientCategoryORMWriteCommand.assignClientToCategory(mockClient, mockCategoryName);
		// A
		verify(mockEntityManagerFactory, times(1)).createEntityManager();
	}
	
	@Test
	public void test_assignClientToCategory_EntityManagerFind() {
		// A
		// A
		clientCategoryORMWriteCommand.assignClientToCategory(mockClient, mockCategoryName);
		// A
		verify(mockEntityManager, times(1)).find(eq(ClientCategory.class), anyString());
	}
	
	@Test
	public void test_assignClientToCategory_returnFalse_IfCategoryNameNotExists() {
		// A
		// A
		boolean value = clientCategoryORMWriteCommand.assignClientToCategory(mockClient, mockCategoryName);
		// A
		assertFalse(value);
	}
	
	@Test
	public void test_assignClientToCategory_closeEntityManager_IfCategoryNameNotExists() {
		// A
		// A
		clientCategoryORMWriteCommand.assignClientToCategory(mockClient, mockCategoryName);
		// A
		verify(mockEntityManager, times(1)).close();
	}

	@Test
	public void test_assignClientToCategory_createEntityTransaction_IfCategoryNameExists() {
		// A
		when(mockEntityManager.find(eq(ClientCategory.class), anyString())).thenReturn(mockClientCategory);
		// A
		clientCategoryORMWriteCommand.assignClientToCategory(mockClient, mockCategoryName);
		// A
		verify(mockEntityManager, times(1)).getTransaction();
	}
	
	@Test
	public void test_assignClientToCategory_TransactionBegin_IfCategoryNameExists() {
		// A
		when(mockEntityManager.find(eq(ClientCategory.class), anyString())).thenReturn(mockClientCategory);
		// A
		clientCategoryORMWriteCommand.assignClientToCategory(mockClient, mockCategoryName);
		// A
		verify(mockEntityTransaction, times(1)).begin();
	}
	
	@Test
	public void test_assignClientToCategory_AddClient_IfCategoryNameExists() {
		// A
		when(mockEntityManager.find(eq(ClientCategory.class), anyString())).thenReturn(mockClientCategory);
		// A
		clientCategoryORMWriteCommand.assignClientToCategory(mockClient, mockCategoryName);
		// A
		verify(mockClientCategory, times(1)).addClient(mockClient);
	}

	@Test
	public void test_assignClientToCategory_TransactionCommit_IfCategoryNameExists() {
		// A
		when(mockEntityManager.find(eq(ClientCategory.class), anyString())).thenReturn(mockClientCategory);
		// A
		clientCategoryORMWriteCommand.assignClientToCategory(mockClient, mockCategoryName);
		// A
		verify(mockEntityTransaction, times(1)).commit();
	}

	@Test
	public void test_assignClientToCategory_closeEntityManager_IfCategoryNameExists() {
		// A
		when(mockEntityManager.find(eq(ClientCategory.class), anyString())).thenReturn(mockClientCategory);
		// A
		clientCategoryORMWriteCommand.assignClientToCategory(mockClient, mockCategoryName);
		// A
		verify(mockEntityManager, times(1)).close();
	}
	
	@Test
	public void test_removeClientFromCategory_createEntityManager() {
		// A
		when(mockEntityManager.find(eq(ClientCategory.class), anyString())).thenReturn(mockClientCategory);
		// A
		clientCategoryORMWriteCommand.removeClientFromCategory(mockId, mockCategoryName);
		// A
		verify(mockEntityManagerFactory, times(1)).createEntityManager();
	}
	
	@Test
	public void test_removeClientFromCategory_EntityManagerFindCategory() {
		// A
		// A
		clientCategoryORMWriteCommand.removeClientFromCategory(mockId, mockCategoryName);
		// A
		verify(mockEntityManager, times(1)).find(eq(ClientCategory.class), anyString());
	}
	
	@Test
	public void test_removeClientFromCategory_EntityManagerFindClient() {
		// A
		// A
		clientCategoryORMWriteCommand.removeClientFromCategory(mockId, mockCategoryName);
		// A
		verify(mockEntityManager, times(1)).find(eq(Client.class), anyInt());
	}
	
	@Test
	public void test_removeClientFromCategory_returnFalse_IfCategoryNameOrClientNotExists() {
		// A
		// A
		boolean value = clientCategoryORMWriteCommand.removeClientFromCategory(mockId, mockCategoryName);
		// A
		assertFalse(value);
	}
	
	@Test
	public void test_removeClientFromCategory_closeEntityManager_IfCategoryNameOrClientNotExists() {
		// A
		// A
		clientCategoryORMWriteCommand.removeClientFromCategory(mockId, mockCategoryName);
		// A
		verify(mockEntityManager, times(1)).close();
	}

	@Test
	public void test_removeClientFromCategory_createEntityTransaction_IfCategoryNameOrClientExists() {
		// A
		when(mockEntityManager.find(eq(ClientCategory.class), anyString())).thenReturn(mockClientCategory);
		when(mockEntityManager.find(eq(Client.class), anyInt())).thenReturn(mockClient);
		// A
		clientCategoryORMWriteCommand.removeClientFromCategory(mockId, mockCategoryName);
		// A
		verify(mockEntityManager, times(1)).getTransaction();
	}
	
	@Test
	public void test_removeClientFromCategory_TransactionBegin_IfCategoryNameOrClientExists() {
		// A
		when(mockEntityManager.find(eq(ClientCategory.class), anyString())).thenReturn(mockClientCategory);
		when(mockEntityManager.find(eq(Client.class), anyInt())).thenReturn(mockClient);
		// A
		clientCategoryORMWriteCommand.removeClientFromCategory(mockId, mockCategoryName);
		// A
		verify(mockEntityTransaction, times(1)).begin();
	}
	
	@Test
	public void test_removeClientFromCategory_RemoveClient_IfCategoryNameOrClientExists() {
		// A
		when(mockEntityManager.find(eq(ClientCategory.class), anyString())).thenReturn(mockClientCategory);
		when(mockEntityManager.find(eq(Client.class), anyInt())).thenReturn(mockClient);
		// A
		clientCategoryORMWriteCommand.removeClientFromCategory(mockId, mockCategoryName);
		// A
		verify(mockClientCategory, times(1)).removeClient(mockClient);
	}

	@Test
	public void test_removeClientFromCategory_TransactionCommit_IfCategoryNameOrClientExists() {
		// A
		when(mockEntityManager.find(eq(ClientCategory.class), anyString())).thenReturn(mockClientCategory);
		when(mockEntityManager.find(eq(Client.class), anyInt())).thenReturn(mockClient);
		// A
		clientCategoryORMWriteCommand.removeClientFromCategory(mockId, mockCategoryName);
		// A
		verify(mockEntityTransaction, times(1)).commit();
	}

	@Test
	public void test_removeClientFromCategory_closeEntityManager_IfCategoryNameOrClientExists() {
		// A
		when(mockEntityManager.find(eq(ClientCategory.class), anyString())).thenReturn(mockClientCategory);
		when(mockEntityManager.find(eq(Client.class), anyInt())).thenReturn(mockClient);
		// A
		clientCategoryORMWriteCommand.removeClientFromCategory(mockId, mockCategoryName);
		// A
		verify(mockEntityManager, times(1)).close();
	}
}
