package com.springex;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AccountDao {
	EntityManager manager;

	public AccountDao(EntityManager manager) {
		super();
		this.manager = manager;
	}
	
	public void createAccount(int accountNumber,String owner,double balance){
		manager.persist(new Account(accountNumber,owner,balance));
	}
}
