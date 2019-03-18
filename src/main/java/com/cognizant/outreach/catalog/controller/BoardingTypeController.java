package com.cognizant.outreach.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.catalog.entity.BoardingType;
import com.cognizant.outreach.catalog.service.BoardingTypeService;

@RestController
@RequestMapping("/api/boardingtypes")
public class BoardingTypeController {
	
	private BoardingTypeService boardingTypeService;
	
	@Autowired
	public BoardingTypeController(BoardingTypeService boardingTypeService) {
		super();
		this.boardingTypeService = boardingTypeService;
	}
	
	@GetMapping("/")
	@CrossOrigin("*")
	public List<BoardingType> findBoardingTypes(){
		return this.boardingTypeService.findBoardingTypes();
	}
}
