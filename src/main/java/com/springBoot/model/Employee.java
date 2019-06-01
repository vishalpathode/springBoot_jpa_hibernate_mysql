package com.springBoot.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Employees")
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull
	private String name;
	
	@NotNull
	private String designation;
	
	@NotNull
	private String expertise;
	
	//@Temporal(TemporalType.TIMESTAMP)
	//@LastModifiedDate
	//private Date createdAt;

	
	public Long getId() {
		return id;
	}

	public Employee() {
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	
}


