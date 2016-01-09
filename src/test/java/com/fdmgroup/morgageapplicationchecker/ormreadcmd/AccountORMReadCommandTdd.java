package com.fdmgroup.morgageapplicationchecker.ormreadcmd;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.fdmgroup.morgageapplicationchecker.entities.Account;
import com.fdmgroup.morgageapplicationchecker.entities.Client;
import com.fdmgroup.morgageapplicationchecker.ormreadcmd.AccountORMReadCommand;

public class AccountORMReadCommandTdd {

	@Mock
	private EntityManagerFactory mockEntityManagerFactory;
	private EntityManager mockEntityManager;
	private int clientId;
	private Client mockClient;
	private String type;
	private Account mockAccount;
	private List<Account> mockListOfAccounts;
	private int i;
	
	@InjectMocks
	private AccountORMReadCommand accountORMReadCommand;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		mockEntityManager = mock(EntityManager.class);
		mockClient = mock(Client.class);
		mockAccount = mock(Account.class);
		mockListOfAccounts = mock(List.class);
		type = "mockString";
		
		when(mockEntityManagerFactory.createEntityManager()).thenReturn(mockEntityManager);
		when(mockEntityManager.find(Client.class, clientId)).thenReturn(mockClient);
		when(mockClient.getAccounts()).thenReturn(mockListOfAccounts);
		when(mockListOfAccounts.size()).thenReturn(1);
		when(mockListOfAccounts.get(anyInt())).thenReturn(mockAccount);
		when(mockAccount.getType()).thenReturn(type);

		
	}

	@Test
	public void test_getAccountsByClientId_CreateEntityManagerMethodHasBeenCalled() {
		//Arrange
		//Act
		accountORMReadCommand.getAccountsByClientId(clientId, type);
		//Assert
		verify(mockEntityManagerFactory,times(1)).createEntityManager();
		
	}
	
	@Test
	public void test_GetAccountsByClientId_WhenTheTypeMatched_ThenAddItToTheSelectedList(){
		//Arrange
		//Act
		List<Account> result = accountORMReadCommand.getAccountsByClientId(clientId, type);
		//Assert
		assertEquals(result.size(), 1);
	}
	
	@Test
	public void test_GetAccountsByClientId_CloseMethodHasBeenCalled(){
		//Arrange
		//Act
		accountORMReadCommand.getAccountsByClientId(clientId, type);
		//Assert
		verify(mockEntityManager,times(1)).close();
	}

}
