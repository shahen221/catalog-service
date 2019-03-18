package com.cognizant.outreach.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.outreach.catalog.dao.BeneficiaryDAO;
import com.cognizant.outreach.catalog.entity.Beneficiary;

@Service
public class BeneficiaryService {

	private BeneficiaryDAO beneficiaryDAO;
	
	@Autowired
	public BeneficiaryService(BeneficiaryDAO beneficiaryDAO) {
		super();
		this.beneficiaryDAO = beneficiaryDAO;
	}
	
	public List<Beneficiary> findBeneficiariesByLocation(Long locationId){
		return this.beneficiaryDAO.findBeneficiariesByLocationId(locationId);
	}
}
