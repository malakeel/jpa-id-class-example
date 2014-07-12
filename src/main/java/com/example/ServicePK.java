package com.example;

import java.io.Serializable;

public class ServicePK implements Serializable {

	private Person client;

	private Person serviceProvider;

	Person getClient() {
		return client;
	}

	void setClient(Person client) {
		this.client = client;
	}

	Person getServiceProvider() {
		return serviceProvider;
	}

	void setServiceProvider(Person serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((serviceProvider == null) ? 0 : serviceProvider.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServicePK other = (ServicePK) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (serviceProvider == null) {
			if (other.serviceProvider != null)
				return false;
		} else if (!serviceProvider.equals(other.serviceProvider))
			return false;
		return true;
	}

}
