package com.cognizant.outreach.catalog.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.catalog.entity.ProjectCategory;

public interface ProjectCategoryDAO extends JpaRepository<ProjectCategory, Long> {
	
	public List<ProjectCategory> findByProjectId(Long projectId);
	
	public ProjectCategory findByProjectIdAndId(Long projectId, Long categoryId);
	
}
