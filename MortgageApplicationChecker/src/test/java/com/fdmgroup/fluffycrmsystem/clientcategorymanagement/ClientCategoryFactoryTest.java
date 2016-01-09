package com.fdmgroup.fluffycrmsystem.clientcategorymanagement;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategory;
import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategoryFactory;

public class ClientCategoryFactoryTest {

	private ClientCategoryFactory factory;
	private String mockName;
	private String mockDesription;

	@Before
	public void setup() {
		factory = new ClientCategoryFactory();
	}

	@Test
	public void test_createClient_ReturnClient() {
		// A
		// A
		ClientCategory clientCategory = factory.generateClientCategory(mockName, mockDesription);
		// A
		assertTrue(clientCategory instanceof ClientCategory);
	}
}
