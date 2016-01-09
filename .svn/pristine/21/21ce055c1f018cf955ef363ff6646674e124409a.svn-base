package com.fdmgroup.morgageapplicationchecker.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_accounts")
public class Account {
	
	@Id
	@GeneratedValue
	@Column(name="account_id")
	private int id;
	@Column(name="balance_Q1")
	private double balanceQ1;
	@Column(name="balance_Q2")
	private double balanceQ2;
	@Column(name="balance_Q3")
	private double balanceQ3;
	@Column(name="balance_Q4")
	private double balanceQ4;
	@Column(name="interest_rate")
	private double interestRate;
	@Column(name="max_deposit")
	private double maxDeposit;
	@Column(name="type")
	private String type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalanceQ1() {
		return balanceQ1;
	}
	public void setBalanceQ1(double balanceQ1) {
		this.balanceQ1 = balanceQ1;
	}
	public double getBalanceQ2() {
		return balanceQ2;
	}
	public void setBalanceQ2(double balanceQ2) {
		this.balanceQ2 = balanceQ2;
	}
	public double getBalanceQ3() {
		return balanceQ3;
	}
	public void setBalanceQ3(double balanceQ3) {
		this.balanceQ3 = balanceQ3;
	}
	public double getBalanceQ4() {
		return balanceQ4;
	}
	public void setBalanceQ4(double balanceQ4) {
		this.balanceQ4 = balanceQ4;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getMaxDeposit() {
		return maxDeposit;
	}
	public void setMaxDeposit(double maxDeposit) {
		this.maxDeposit = maxDeposit;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
