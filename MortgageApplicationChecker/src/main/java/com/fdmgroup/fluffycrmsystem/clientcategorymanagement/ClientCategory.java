package com.fdmgroup.fluffycrmsystem.clientcategorymanagement;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fdmgroup.fluffycrmsystem.clientmanagement.Client;

@Entity
@Table(name="client_category")
public class ClientCategory {
	
	@Id
	@Column(name="category_name")
	private String categoryName;
	@Column(name="description")
	private String description;
	
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Client> clients;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void addClient(Client client) {
		clients.add(client);
	}

	public void removeClient(Client client) {
		clients.remove(client);
	}
	
	public List<Client> getClients() {
		return clients;
	}
	
	public int getCategorySize() {
		return clients.size();
	}
}
