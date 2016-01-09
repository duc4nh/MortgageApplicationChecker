package com.fdmgroup.morgageapplicationchecker.ormreadcmd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.fdmgroup.morgageapplicationchecker.entities.Client;
import com.fdmgroup.morgageapplicationchecker.ormreadcmd.ClientORMReadCommand;

public class ClientORMReadCommandTdd {
	
	@Mock
	private EntityManagerFactory mockEntityManagerFactory;
	private EntityManager mockEntityManager;
	private Client mockClient;
	
	private int id;
	
	@InjectMocks
	private ClientORMReadCommand clientORMReadCommand;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		mockEntityManager = mock(EntityManager.class);
		mockClient = mock(Client.class);
		 id = 0;
			
		when(mockEntityManagerFactory.createEntityManager()).thenReturn(mockEntityManager);

		when(mockEntityManager.find(Client.class, id)).thenReturn(mockClient);
		
	}

	@Test
	public void test_ClientORMReadCommand_CreateMethodHasBeenCalled() {
		//Arrange
		//Act
		clientORMReadCommand.getClientById(id);
		//Assert
		verify(mockEntityManagerFactory,times(1)).createEntityManager();
	}
	
	@Test
	public void test_ClientORMReadCommand_CloseMethodHasBeenCalled(){
		//Arrange
		//Act
		clientORMReadCommand.getClientById(id);
		//Assert
		verify(mockEntityManager,times(1)).close();
	}

}
