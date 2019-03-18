package com.cognizant.outreach.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.catalog.entity.BoardingPoint;
import com.cognizant.outreach.catalog.service.BoardingPointService;

@RestController
@RequestMapping("/api/boardingpoints")
public class BoardingPointController {

	private BoardingPointService boardingPointService;
	
	@Autowired
	public BoardingPointController(BoardingPointService boardingPointService) {
		super();
		this.boardingPointService = boardingPointService;
	}
	
	@GetMapping("/{locationId}")
	@CrossOrigin("*")
	public List<BoardingPoint> findBoardingPointsByLocation(@PathVariable Long locationId){
		return this.boardingPointService.findBoardingPointsByLocation(locationId);
	}
}
