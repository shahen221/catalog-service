package com.cognizant.outreach.catalog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transport_boarding_type")
public class BoardingType {
	
	@Id
	@Column(name="boarding_type_id")
	private Long id;
	
	@Column(name="boarding_type_name", nullable=false)
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
