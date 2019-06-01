package com.springBoot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.model.Employee;
import com.springBoot.service.EmpService;

@RestController
@RequestMapping("/emp")
public class AppController {

	
	@Autowired
	EmpService empService;
	
	@PostMapping("/save")
	public Employee save(@Valid @RequestBody Employee employee){
		System.out.println("in save....");
		
		return empService.save(employee);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll(){
		System.out.println("in get....");
		
		return empService.findAll();
	}
	
}
