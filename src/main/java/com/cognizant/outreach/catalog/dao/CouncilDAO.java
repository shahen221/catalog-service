package com.cognizant.outreach.catalog.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.catalog.entity.Council;

public interface CouncilDAO extends JpaRepository<Council, Long> {
	
	public List<Council> findCouncilsByLocationId(Long locationId);
	
}
