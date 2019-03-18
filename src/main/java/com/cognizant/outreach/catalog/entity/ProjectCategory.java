package com.cognizant.outreach.catalog.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="project_category")
public class ProjectCategory {
	
	@EmbeddedId
	private ProjectCategoryIdentity projectCategoryIdentity;
	
	@Column(name="category_name", nullable=false)
	private String name;
	
	public ProjectCategory() {
		
	}

	public ProjectCategory(ProjectCategoryIdentity projectCategoryIdentity, String name) {
		super();
		this.projectCategoryIdentity = projectCategoryIdentity;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

