package com.cognizant.outreach.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.catalog.entity.Council;
import com.cognizant.outreach.catalog.service.CouncilService;

@RestController
@RequestMapping("/api/councils")
public class CouncilController {

	private CouncilService councilService;
	
	@Autowired
	public CouncilController(CouncilService councilService) {
		super();
		this.councilService = councilService;
	}
	
	@GetMapping("/{locationId}")
	@CrossOrigin("*")
	public List<Council> findCouncilsByLocation(@PathVariable Long locationId){
		return this.councilService.findCouncilsByLocation(locationId);
	}
	
}
