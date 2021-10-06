package com.docker.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private String id;
	private String title;
	private String description;

	public String getId() {
		return id;
	}

	public Course() {

		// TODO Auto-generated constructor stub
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Course(String id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;

	}

}
