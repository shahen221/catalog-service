package com.cognizant.outreach.catalog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class Location {
	
	@Id
	@Column(name="location_id")
	private Long id;
	
	@Column(name="location_name", nullable=false)
	private String name;
	
	@Column(name="location_state", nullable=false)
	private String state;
	
	@Column(name="location_country", nullable=false)
	private String country;

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
