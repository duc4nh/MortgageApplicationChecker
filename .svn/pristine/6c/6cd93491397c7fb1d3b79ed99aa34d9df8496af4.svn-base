package com.fdmgroup.fluffycrmsystem.transactionmanagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transactions")
public class Transaction {
	
	@Id
	@GeneratedValue
	@Column(name="trans_id")
	int id;
	@Column(name="trans_amount")
	double amount;
	@Column(name="client_id")
	int clientId;
	
	public double getAmount() {
		return amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
