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

import com.fdmgroup.morgageapplicationchecker.controllers.AccountController;
import com.fdmgroup.morgageapplicationchecker.entitiesfactory.AccountFactory;
import com.fdmgroup.morgageapplicationchecker.readcmdinterfaces.AccountReadCommand;

public class AccountControllerTdd {
	
	@Mock
	private AccountReadCommand mockReadCmd;
	@Mock
	private AccountFactory mockFactory;
	
	@InjectMocks
	private AccountController accountController;



	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		//Arrange
		//Act
		accountController.getAccountsById(anyInt(), anyString());
		//Assert
		verify(mockReadCmd,times(1)).getAccountsByClientId(anyInt(), anyString());
	}

}
