package com.cognizant.outreach.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.outreach.catalog.dao.BoardingTypeDAO;
import com.cognizant.outreach.catalog.entity.BoardingType;

@Service
public class BoardingTypeService {
	
	private BoardingTypeDAO boardingTypeDAO;
	
	@Autowired
	public BoardingTypeService(BoardingTypeDAO boardingTypeDAO) {
		super();
		this.boardingTypeDAO = boardingTypeDAO;
	}
	
	public List<BoardingType> findBoardingTypes(){
		return this.boardingTypeDAO.findAll();
	}
}
