package com.api.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.backend.repository.springRepo;
import com.api.backend.model.*;

@RestController
@RequestMapping("/api/v1")
public class backendController {

	@Autowired
	private springRepo repo;
	
	@GetMapping("/employees")
	public List<Employee> getEmp(){
		return repo.findAll();
		
	}
	
}
