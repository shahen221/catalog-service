package com.cognizant.outreach.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.outreach.catalog.dao.BoardingPointDAO;
import com.cognizant.outreach.catalog.entity.BoardingPoint;

@Service
public class BoardingPointService {

	private BoardingPointDAO boardingPointDAO;
	
	@Autowired
	public BoardingPointService(BoardingPointDAO boardingPointDAO) {
		super();
		this.boardingPointDAO = boardingPointDAO;
	}
	
	public List<BoardingPoint> findBoardingPointsByLocation(Long locationId){
		return this.boardingPointDAO.findBoardingPointsByLocationId(locationId);
	}
}
