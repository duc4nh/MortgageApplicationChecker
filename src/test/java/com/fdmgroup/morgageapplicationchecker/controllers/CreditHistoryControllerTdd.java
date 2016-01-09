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

import com.fdmgroup.morgageapplicationchecker.controllers.CreditHistoryController;
import com.fdmgroup.morgageapplicationchecker.entitiesfactory.CreditHistoryFactory;
import com.fdmgroup.morgageapplicationchecker.readcmdinterfaces.CreditHistoryReadCommand;

public class CreditHistoryControllerTdd {

	@Mock
	private CreditHistoryReadCommand mockReadCmd;
	@Mock
	private CreditHistoryFactory mockFactory;
	
	@InjectMocks
	private CreditHistoryController creditHistoryController;
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		//Arrange
		//Assert
		creditHistoryController.getCreditHistoryByClientId(anyInt());
		//Assert
		verify(mockReadCmd,times(1)).getCreditHistoryByClientId(anyInt());
	}

}
