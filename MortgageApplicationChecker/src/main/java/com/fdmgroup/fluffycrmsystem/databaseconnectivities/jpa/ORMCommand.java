package com.fdmgroup.fluffycrmsystem.databaseconnectivities.jpa;

import javax.persistence.EntityManagerFactory;

public abstract class ORMCommand {
	
	protected EntityManagerFactory entityManagerFactory;

	public ORMCommand(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
}
