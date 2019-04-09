package com.cognizant.outreach.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.outreach.catalog.dao.ProjectDAO;
import com.cognizant.outreach.catalog.entity.Project;

@Service
public class ProjectService {

	private ProjectDAO projectDAO;
	
	@Autowired
	public ProjectService(ProjectDAO projectDAO) {
		super();
		this.projectDAO = projectDAO;
	}
	
	public List<Project> findAllProjects(){
		return this.projectDAO.findAll();
	}
	
	public Project findProjectById(Long projectId) {
		return this.projectDAO.findProjectById(projectId);
	}
}
