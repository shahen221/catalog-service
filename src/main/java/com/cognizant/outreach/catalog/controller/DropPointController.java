package com.cognizant.outreach.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.catalog.entity.DropPoint;
import com.cognizant.outreach.catalog.service.DropPointService;

@RestController
@RequestMapping("/api/droppoints")
public class DropPointController {

	private DropPointService dropPointService;
	
	@Autowired
	public DropPointController(DropPointService dropPointService) {
		super();
		this.dropPointService = dropPointService;
	}
	
	@GetMapping("/{locationId}")
	@CrossOrigin("*")
	public List<DropPoint> findDropPointsByLocation(@PathVariable Long locationId){
		return this.dropPointService.findDropPointsByLocation(locationId);
	}
}
