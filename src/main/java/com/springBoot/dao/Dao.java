package com.springBoot.dao;

import java.util.List;

import com.springBoot.model.Employee;

public interface Dao {

	Employee save(Employee employee);
	public List<Employee> findAll();
	
}
