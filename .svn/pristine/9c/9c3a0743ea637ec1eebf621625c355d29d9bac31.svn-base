package com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.jpa;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategory;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.jpa.ClientCategoryORMReadCommand;

public class ClientCategoryORMReadCommandTest {
	private ClientCategoryORMReadCommand clientCategoryORMReadCommand;
	private EntityManagerFactory mockEntityManagerFactory;
	private EntityManager mockEntityManager;
	private Query mockQuery;
	private String mockName;
	
	@Before
	public void setup() {
		mockEntityManagerFactory = mock(EntityManagerFactory.class);
		clientCategoryORMReadCommand = new ClientCategoryORMReadCommand(mockEntityManagerFactory);
		
		mockEntityManager = mock(EntityManager.class);
		when(mockEntityManagerFactory.createEntityManager()).thenReturn(mockEntityManager);
	
		mockQuery = mock(Query.class);
		when(mockEntityManager.createNativeQuery(anyString(), eq(ClientCategory.class))).thenReturn(mockQuery);
	}

	@Test
	public void test_searchForCategory_returnACategory() {
		// A
		ClientCategory mockClientCategory = mock(ClientCategory.class);
		when(mockEntityManager.find(eq(ClientCategory.class), anyString())).thenReturn(mockClientCategory);
		// A
		ClientCategory clientCategory = clientCategoryORMReadCommand.searchForCategory(mockName);
		// A
		assertTrue(clientCategory instanceof ClientCategory);
	}
	
	@Test
	public void test_searchForCategory_createEntityManager() {
		// A
		// A
		clientCategoryORMReadCommand.searchForCategory(mockName);
		// A
		verify(mockEntityManagerFactory, times(1)).createEntityManager();
	}

	@Test
	public void test_searchForCategory_findClientCategory() {
		// A
		// A
		clientCategoryORMReadCommand.searchForCategory(mockName);
		// A
		verify(mockEntityManager, times(1)).find(ClientCategory.class, mockName);
	}

	@Test
	public void test_searchForCategory_closeEntityManager() {
		// A
		// A
		clientCategoryORMReadCommand.searchForCategory(mockName);
		// A
		verify(mockEntityManager, times(1)).close();
	}
	
	@Test
	public void test_getAllClientCategory_returnACategory() {
		// A
		// A
		List<ClientCategory> clientCategories = clientCategoryORMReadCommand.getAllClientCategory();
		// A
		assertTrue(clientCategories instanceof List);
	}
	
	@Test
	public void test_getAllClientCategory_createEntityManager() {
		// A
		// A
		clientCategoryORMReadCommand.getAllClientCategory();
		// A
		verify(mockEntityManagerFactory, times(1)).createEntityManager();
	}

	@Test
	public void test_getAllClientCategory_createNativeQuery() {
		// A
		String sql = "SELECT * FROM client_category";
		// A
		clientCategoryORMReadCommand.getAllClientCategory();
		// A
		verify(mockEntityManager, times(1)).createNativeQuery(sql, ClientCategory.class);
	}
	
	@Test
	public void test_getAllClientCategory_getResultList() {
		// A
		// A
		clientCategoryORMReadCommand.getAllClientCategory();
		// A
		verify(mockQuery, times(1)).getResultList();
	}

	@Test
	public void test_getAllClientCategory_closeEntityManager() {
		// A
		// A
		clientCategoryORMReadCommand.getAllClientCategory();
		// A
		verify(mockEntityManager, times(1)).close();
	}
}
