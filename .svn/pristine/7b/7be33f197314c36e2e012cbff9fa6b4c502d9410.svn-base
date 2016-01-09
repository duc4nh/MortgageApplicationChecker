package com.fdmgroup.morgageapplicationchecker.controllers;

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

import com.fdmgroup.morgageapplicationchecker.controllers.ClientController;
import com.fdmgroup.morgageapplicationchecker.entitiesfactory.ClientFactory;
import com.fdmgroup.morgageapplicationchecker.readcmdinterfaces.ClientReadCommand;

public class ClientControllerTdd {

	@Mock
	private ClientReadCommand mockReadCmd;
	@Mock
	private ClientFactory mockFactory;

	@InjectMocks
	private ClientController clientController;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		//Arrange
		//Act
		clientController.getClientById(anyInt());
		//Assert
		verify(mockReadCmd,times(1)).getClientById(anyInt());
	}

}
