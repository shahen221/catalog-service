package com.cognizant.outreach.catalog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.outreach.catalog.dao.LocationDAO;
import com.cognizant.outreach.catalog.entity.Location;

@Service
public class LocationService {

	private LocationDAO locationDAO;

	public LocationService(LocationDAO locationDAO) {
		super();
		this.locationDAO = locationDAO;
	}
	
	public List<Location> findAllLocations(){
		return this.locationDAO.findAll();
	}
	
	public Location findLocationById(Long locationId) {
		return this.locationDAO.findLocationById(locationId);
	}
}
