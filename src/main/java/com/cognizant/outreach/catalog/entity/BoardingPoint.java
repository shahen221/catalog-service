package com.cognizant.outreach.catalog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transport_boarding_points")
public class BoardingPoint {
	
	@Id
	@Column(name="boarding_point_id")
	private Long id;
	
	@Column(name="boarding_point_name", nullable=false)
	private String name;
	
	@Column(name="location_id", nullable=false)
	private Long locationId;

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

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}
	
}
