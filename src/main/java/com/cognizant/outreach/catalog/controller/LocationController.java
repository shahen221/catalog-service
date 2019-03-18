package com.cognizant.outreach.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.catalog.entity.Location;
import com.cognizant.outreach.catalog.service.LocationService;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

	private LocationService locationService;
	
	@Autowired
	public LocationController(LocationService locationService) {
		super();
		this.locationService = locationService;
	}
	
	@GetMapping("/")
	@CrossOrigin("*")
	public List<Location> findLocations(){
		return this.locationService.findAllLocations();
	}
	
	@GetMapping("/{locationId}")
	public Location findByLocationId(@PathVariable Long locationId) {
		return this.locationService.findLocationById(locationId);
	}
	
}
