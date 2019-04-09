package com.cognizant.outreach.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.catalog.entity.Project;
import com.cognizant.outreach.catalog.service.ProjectService;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
	
	private ProjectService projectService;
	
	@Autowired
	public ProjectController(ProjectService projectService) {
		super();
		this.projectService = projectService;
	}
	
	@GetMapping("/")
	@CrossOrigin("*")
	public List<Project> findAllProjects(){
		return this.projectService.findAllProjects();
	}
	
	@GetMapping("/{projectId}")
	@CrossOrigin("*")
	public Project findProjectById(@PathVariable Long projectId){
		return this.projectService.findProjectById(projectId);
	}
	
}
