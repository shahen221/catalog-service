package com.cognizant.outreach.catalog.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class ProjectCategoryIdentity implements Serializable {

	@Column(name="category_id")
	private Long id;
	
	@Column(name="project_id")
	private Long projectId;
	
	public ProjectCategoryIdentity() {
		
	}
	
	public ProjectCategoryIdentity(Long id, Long projectId) {
		super();
		this.id = id;
		this.projectId = projectId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
}
