package com.cognizant.outreach.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.outreach.catalog.dao.BusinessUnitDAO;
import com.cognizant.outreach.catalog.entity.BusinessUnit;

@Service
public class BusinessUnitService {

	private BusinessUnitDAO businessUnitDAO;
	
	@Autowired
	public BusinessUnitService(BusinessUnitDAO businessUnitDAO) {
		super();
		this.businessUnitDAO = businessUnitDAO;
	}
	
	public List<BusinessUnit> findAllBusinessUnits(){
		return this.businessUnitDAO.findAll();
	}
	
}
