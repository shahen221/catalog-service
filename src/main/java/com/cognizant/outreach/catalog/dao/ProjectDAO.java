package com.cognizant.outreach.catalog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.catalog.entity.Project;

public interface ProjectDAO extends JpaRepository<Project, Long> {
	public Project findProjectById(Long projectId);
}
