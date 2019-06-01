package com.springBoot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springBoot.model.Employee;
import com.springBoot.repository.EmpRepository;

@Repository
public class DaoImpl implements Dao {

	@Autowired
	EmpRepository empRepository;
	
	@Override
	public Employee save(Employee employee) {
		return empRepository.save(employee);
	}

	@Override
	public List<Employee> findAll() {
		return empRepository.findAll();
	}

}
