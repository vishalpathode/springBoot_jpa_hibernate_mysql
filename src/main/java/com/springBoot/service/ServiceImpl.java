package com.springBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springBoot.dao.Dao;
import com.springBoot.model.Employee;

@Service
public class ServiceImpl implements EmpService {

	@Autowired
	Dao dao;
	
	@Override
	@Transactional
	public Employee save(Employee employee) {
		return dao.save(employee);
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		return dao.findAll();

	}

}
