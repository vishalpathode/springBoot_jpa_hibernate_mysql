package com.springBoot.service;

import java.util.List;

import com.springBoot.model.Employee;

public interface EmpService {

	Employee save(Employee employee);
	
	public List<Employee> findAll();
}
