package com.cognizant.outreach.catalog.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.catalog.entity.DropPoint;

public interface DropPointDAO extends JpaRepository<DropPoint, Long>  {
	
	public List<DropPoint> findDropPointsByLocationId(Long locationId);
	
}
