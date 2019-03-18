package com.cognizant.outreach.catalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.catalog.entity.BoardingType;

public interface BoardingTypeDAO extends JpaRepository<BoardingType, Long>  {
	
}
