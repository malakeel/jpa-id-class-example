package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServiceType {

	@Id
	private String id;

	private String description;

	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

}
