package com.fdmgroup.morgageapplicationchecker.ormreadcmd;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;

public abstract class ORMCommand {
	
	@Resource
	protected EntityManagerFactory entityManagerFactory;
}
