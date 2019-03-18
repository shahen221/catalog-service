package com.cognizant.outreach.catalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.catalog.entity.Location;

public interface LocationDAO extends JpaRepository<Location, Long> {

	public Location findLocationById(Long locationId);
	
}
