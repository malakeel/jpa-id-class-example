package com.example;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(ServicePK.class)
public class Service {

	@Id
	@ManyToOne
	@JoinColumn(name = "client_id", referencedColumnName = "id")
	private Person client;

	@Id
	@ManyToOne
	@JoinColumn(name = "ser_provider_id", referencedColumnName = "id")
	private Person serviceProvider;

	@ManyToOne(fetch = FetchType.EAGER)
	// @Column(name = "type_id")
	private ServiceType type;

	public Person getClient() {
		return client;
	}

	public void setClient(Person client) {
		this.client = client;
	}

	public Person getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(Person serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	public ServiceType getType() {
		return type;
	}

	public void setType(ServiceType type) {
		this.type = type;
	}
}
