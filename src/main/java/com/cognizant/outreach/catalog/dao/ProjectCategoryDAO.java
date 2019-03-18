package com.cognizant.outreach.catalog.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.outreach.catalog.entity.ProjectCategory;
import com.cognizant.outreach.catalog.entity.ProjectCategoryIdentity;

public interface ProjectCategoryDAO extends JpaRepository<ProjectCategory, ProjectCategoryIdentity> {
	
	public List<ProjectCategory> findByProjectCategoryIdentityProjectId(Long projectId);
	
}
