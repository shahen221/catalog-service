package com.cognizant.outreach.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.catalog.entity.BusinessUnit;
import com.cognizant.outreach.catalog.service.BusinessUnitService;

@RestController
@RequestMapping("/api/businessunits")
public class BusinessUnitController {
	
	private BusinessUnitService businessUnitService;
	
	@Autowired
	public BusinessUnitController(BusinessUnitService businessUnitService) {
		super();
		this.businessUnitService = businessUnitService;
	}
	
	@GetMapping("/")
	@CrossOrigin("*")
	public List<BusinessUnit> findAllBusinessUnits(){
		return this.businessUnitService.findAllBusinessUnits();
	}
	
}
