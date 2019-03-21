package com.cognizant.outreach.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.catalog.entity.ProjectCategory;
import com.cognizant.outreach.catalog.service.ProjectCategoryService;

@RestController
@RequestMapping("/api/categories")
public class ProjectCategoryController {

	private ProjectCategoryService projectCategoryService;
	
	@Autowired
	public ProjectCategoryController(ProjectCategoryService projectCategoryService) {
		super();
		this.projectCategoryService = projectCategoryService;
	}
	
	@GetMapping("/{projectId}")
	@CrossOrigin("*")
	public List<ProjectCategory> findCategoriesByProject(@PathVariable Long projectId){
		return this.projectCategoryService.findCategoriesByProject(projectId);
	}
	
	@GetMapping("/{projectId}/{categoryId}")
	@CrossOrigin("*")
	public String findCategoryName(@PathVariable Long projectId, @PathVariable Long categoryId){
		ProjectCategory projectCategory = this.projectCategoryService.findCategoryName(projectId, categoryId);
		return projectCategory.getName();
	}
}
