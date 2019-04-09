package com.cognizant.outreach.catalog.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="project_category")
@IdClass(ProjectCategoryId.class)
public class ProjectCategory implements Serializable{
	
	@Id
	@Column(name="category_id")
	private Long id;
	
	@Id
	@Column(name="project_id")
	private Long projectId;
	
	@Column(name="category_name", nullable=false)
	private String name;
	
	@ManyToOne
	@JoinColumn(name="project_id", insertable=false, updatable=false)
	private Project project;
	
	public ProjectCategory() {
		
	}

	public ProjectCategory(Long id, Long projectId, String name) {
		super();
		this.id = id;
		this.projectId = projectId;
		this.name = name;
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

@SuppressWarnings("serial")
class ProjectCategoryId implements Serializable {
	private Long id;
	private Long projectId;
	
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

