package com.fdmgroup.morgageapplicationchecker.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="m_brokers")
public class Broker {

	@Id
	@GeneratedValue
	@Column(name="broker_id")
	private int id;
	@Column(name="user_name", unique = true)
	private String userName;
	@Column(name="password")
	private String password;
	
	@OneToMany
	private List<Client> clients;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public List<Client> getClients() {
		return clients;
	}
}
