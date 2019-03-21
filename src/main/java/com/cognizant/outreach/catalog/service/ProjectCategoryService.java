package com.cognizant.outreach.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.outreach.catalog.dao.ProjectCategoryDAO;
import com.cognizant.outreach.catalog.entity.ProjectCategory;
import com.cognizant.outreach.catalog.entity.ProjectCategoryIdentity;

@Service
public class ProjectCategoryService {
	
	private ProjectCategoryDAO projectCategoryDAO;
	
	@Autowired
	public ProjectCategoryService(ProjectCategoryDAO projectCategoryDAO) {
		super();
		this.projectCategoryDAO = projectCategoryDAO;
	}
	
	public List<ProjectCategory> findCategoriesByProject(Long projectId){
		return this.projectCategoryDAO.findByProjectCategoryIdentityProjectId(projectId);
	}
	
	public ProjectCategory findCategoryName(Long projectId, Long categoryId) {
		ProjectCategoryIdentity projectCategoryIdentity = new ProjectCategoryIdentity();
		projectCategoryIdentity.setId(categoryId);
		projectCategoryIdentity.setProjectId(projectId);
		return this.projectCategoryDAO.findByProjectCategoryIdentity(projectCategoryIdentity);
	}
	
}
