package com.cognizant.outreach.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.outreach.catalog.dao.CouncilDAO;
import com.cognizant.outreach.catalog.entity.Council;

@Service
public class CouncilService {

	private CouncilDAO councilDAO;
	
	@Autowired
	public CouncilService(CouncilDAO councilDAO) {
		super();
		this.councilDAO = councilDAO;
	}
	
	public List<Council> findCouncilsByLocation(Long locationId){
		return this.councilDAO.findCouncilsByLocationId(locationId);
	}
	
}
