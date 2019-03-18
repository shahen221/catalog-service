package com.cognizant.outreach.catalog.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.catalog.entity.Beneficiary;

public interface BeneficiaryDAO extends JpaRepository<Beneficiary, Long> {
	List<Beneficiary> findBeneficiariesByLocationId(Long locationId);
}
