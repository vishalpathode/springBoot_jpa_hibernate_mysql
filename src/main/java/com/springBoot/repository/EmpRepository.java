package com.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBoot.model.Employee;

public interface EmpRepository extends JpaRepository<Employee, Long>{

}
