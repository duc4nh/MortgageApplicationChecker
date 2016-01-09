package com.fdmgroup.fluffycrmsystem.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategory;
import com.fdmgroup.fluffycrmsystem.clientcategorymanagement.ClientCategoryFactory;
import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.ClientCategoryReadCommand;
import com.fdmgroup.fluffycrmsystem.databaseconnectivities.clientcategory.ClientCategoryWriteCommand;

public class ClientCategoryControllerTest {
	
	private ClientCategoryReadCommand mockReader;
	private ClientCategoryWriteCommand mockWriter;
	private ClientCategoryFactory mockCategoryfactory;
	private ClientCategoryController controller;
	private String categoryName;
	private String description;
	private Client mockClient;
	private int mockClientId;
	
	@Before
	public void setup() {
		mockReader = mock(ClientCategoryReadCommand.class);
		mockWriter = mock(ClientCategoryWriteCommand.class);
		mockCategoryfactory = mock(ClientCategoryFactory.class);
		controller = new ClientCategoryController(mockReader, mockWriter, mockCategoryfactory);
	}
	
	@Test
	public void test_generateClientCategory_callFactory() {
		// A
		// A
		controller.generateClientCategory(categoryName, description);
		// A
		verify(mockCategoryfactory, times(1)).generateClientCategory(categoryName, description);
	}
	
	@Test
	public void test_generateClientCategory() {
		// A
		ClientCategory mockCategory = mock(ClientCategory.class);
		when(mockCategoryfactory.generateClientCategory(categoryName, description)).thenReturn(mockCategory);
		// A
		controller.generateClientCategory(categoryName, description);
		// A
		verify(mockWriter, times(1)).generateClientCategory(mockCategory);
	}
	
	@Test
	public void test_generateClientCategory_createCategoryFromFactory() {
		// A
		// A
		controller.generateClientCategory(categoryName, description);
		// A
		verify(mockCategoryfactory, times(1)).generateClientCategory(categoryName, description);
	}
	
	@Test
	public void test_assignClientToCategory() {
		// A
		// A
		controller.assignClientToCategory(mockClient, categoryName);
		// A
		verify(mockWriter, times(1)).assignClientToCategory(mockClient, categoryName);
	}
	
	@Test
	public void test_removeFromCategory() {
		// A
		// A
		controller.removeClientFromCategory(mockClientId, categoryName);
		// A
		verify(mockWriter, times(1)).removeClientFromCategory(mockClientId, categoryName);
	}
	
	@Test
	public void test_searchForCategory() {
		// A
		// A
		controller.searchForCategory(categoryName);
		// A
		verify(mockReader, times(1)).searchForCategory(categoryName);
	}
	
	@Test
	public void test_searchForCategory_ReturnCategory() {
		// A
		ClientCategory mockCat = mock(ClientCategory.class);
		when(mockReader.searchForCategory(anyString())).thenReturn(mockCat);
		// A
		ClientCategory cat = controller.searchForCategory(categoryName);
		// A
		assertEquals(cat, mockCat);
	}
	
	@Test
	public void test_getAllClientCategory() {
		// A
		// A
		controller.getAllClientCategory();
		// A
		verify(mockReader, times(1)).getAllClientCategory();
	}
}
