package com.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course 
{    @Id
	private Long id;
	private String tittle;
	private String descripation;
	public Course() {
		super();
	}
	public Course(Long id, String tittle, String descripation) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.descripation = descripation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getDescripation() {
		return descripation;
	}
	public void setDescripation(String descripation) {
		this.descripation = descripation;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", tittle=" + tittle + ", descripation=" + descripation + "]";
	}
	
	
	

}
