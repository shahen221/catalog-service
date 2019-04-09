package com.cognizant.outreach.catalog.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {
	
	@Id
	@Column(name="project_id")
	private Long id;
	
	@Column(name="project_name")
	private String name;
	
	@OneToMany(mappedBy="project",cascade=CascadeType.ALL)
	private Set<ProjectCategory> projectCategories= new HashSet<ProjectCategory>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<ProjectCategory> getProjectCategories() {
		return projectCategories;
	}

	public void setProjectCategories(Set<ProjectCategory> projectCategories) {
		this.projectCategories = projectCategories;
	}

}
