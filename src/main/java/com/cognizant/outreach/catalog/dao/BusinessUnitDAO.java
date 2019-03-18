package com.cognizant.outreach.catalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.catalog.entity.BusinessUnit;

public interface BusinessUnitDAO extends JpaRepository<BusinessUnit, Long> {
	
}
