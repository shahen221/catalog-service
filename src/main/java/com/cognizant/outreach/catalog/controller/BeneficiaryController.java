package com.cognizant.outreach.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.catalog.entity.Beneficiary;
import com.cognizant.outreach.catalog.service.BeneficiaryService;

@RestController
@RequestMapping("/api/beneficiaries")
public class BeneficiaryController {
	
	private BeneficiaryService beneficiaryService;
	
	@Autowired
	public BeneficiaryController(BeneficiaryService beneficiaryService) {
		super();
		this.beneficiaryService = beneficiaryService;
	}
	
	@GetMapping("/{locationid}")
	@CrossOrigin("*")
	public List<Beneficiary> getBeneficiariesByLocation(@PathVariable Long locationid){
		return this.beneficiaryService.findBeneficiariesByLocation(locationid);
	}
}
