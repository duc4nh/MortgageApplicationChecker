package com.fdmgroup.morgageapplicationchecker.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_credit_history")
public class CreditHistory {
	
	@Id
	@GeneratedValue
	@Column(name="credit_id")
	private int id;
	@Column(name="fico_score")
	private int ficoScore;
	@Column(name="ap_rate")
	private double annualPercentageRate;
	@Column(name="monthly_payment")
	private double monthlyPayment;
	@Column(name="ti_paid")
	private String totalInterestPaid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFicoScore() {
		return ficoScore;
	}
	public void setFicoScore(int ficoScore) {
		this.ficoScore = ficoScore;
	}
	public double getAnnualPercentageRate() {
		return annualPercentageRate;
	}
	public void setAnnualPercentageRate(double annualPercentageRate) {
		this.annualPercentageRate = annualPercentageRate;
	}
	public double getMonthlyPayment() {
		return monthlyPayment;
	}
	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	public String getTotalInterestPaid() {
		return totalInterestPaid;
	}
	public void setTotalInterestPaid(String totalInterestPaid) {
		this.totalInterestPaid = totalInterestPaid;
	}
}