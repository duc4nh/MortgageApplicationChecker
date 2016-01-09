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

import com.fdmgroup.morgageapplicationchecker.entities.Client;
import com.fdmgroup.morgageapplicationchecker.entities.CreditHistory;
import com.fdmgroup.morgageapplicationchecker.ormreadcmd.CreditHistoryORMReadCommand;

public class CreditHistoryORMReadCommandTdd {

	@Mock
	private EntityManagerFactory mockEntityManagerFactory;
	private EntityManager mockEntityManager;
	private CreditHistory mockCreditHistory;
	private Client mockClient;
	private int id;
	
	@InjectMocks
	private CreditHistoryORMReadCommand creditHistoryORMReadCommand;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		mockEntityManager = mock(EntityManager.class);
		mockCreditHistory = mock(CreditHistory.class);
		mockClient = mock(Client.class);
		
		when(mockEntityManagerFactory.createEntityManager()).thenReturn(mockEntityManager);
		when(mockEntityManager.find(CreditHistory.class, id)).thenReturn(mockCreditHistory);
		
		when(mockEntityManager.find(Client.class, id)).thenReturn(mockClient);
	}

	@Test
	public void test_GetCreditHistoryById_CreatMethodHasBeenCalled() {
		//Arrange
		//Act
		creditHistoryORMReadCommand.getCreditHistoryByClientId(id);
		//Assert
		verify(mockEntityManagerFactory,times(1)).createEntityManager();
	}
	
	@Test
	public void test_GetCreditHistoryById_closeMethodHasBeenCalled(){
		//Arrange
		//Act
		creditHistoryORMReadCommand.getCreditHistoryByClientId(id);
		//Assert
		verify(mockEntityManager,times(1)).close();
	}
	
	@Test
	public void test_GetHistoryByClientId_CreatMethodHasBeenCalled() {
		//Arrange
		//Act
		creditHistoryORMReadCommand.getCreditHistoryByClientId(id);
		//Assert
		verify(mockEntityManagerFactory,times(1)).createEntityManager();
	}
	
	@Test
	public void test_GetHistoryByClientId_closeMethodHasBeenCalled(){
		//Arrange
		//Act
		creditHistoryORMReadCommand.getCreditHistoryByClientId(id);
		//Assert
		verify(mockEntityManager,times(1)).close();
	}


}
