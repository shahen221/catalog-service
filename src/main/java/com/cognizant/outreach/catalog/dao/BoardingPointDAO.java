package com.cognizant.outreach.catalog.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.catalog.entity.BoardingPoint;

public interface BoardingPointDAO extends JpaRepository<BoardingPoint, Long>  {
	
	public List<BoardingPoint> findBoardingPointsByLocationId(Long locationId);
	
}
