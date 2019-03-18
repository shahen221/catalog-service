package com.cognizant.outreach.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.outreach.catalog.dao.DropPointDAO;
import com.cognizant.outreach.catalog.entity.DropPoint;

@Service
public class DropPointService {
	
	private DropPointDAO dropPointDAO;
	
	@Autowired
	public DropPointService(DropPointDAO dropPointDAO) {
		super();
		this.dropPointDAO = dropPointDAO;
	}
	
	public List<DropPoint> findDropPointsByLocation(Long locationId){
		return this.dropPointDAO.findDropPointsByLocationId(locationId);
	}
}
