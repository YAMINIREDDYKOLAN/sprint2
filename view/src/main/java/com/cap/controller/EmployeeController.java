package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.service.EmployeeService;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/emp")
@CrossOrigin("http://localhost:4200")

public class EmployeeController
{
	@Autowired
	EmployeeService bcgservice;

	@GetMapping("checkStatus/{empId}")
	//@GetMapping(value="/checkStatus/{EmpId}")
	public  String checkstatus(@PathVariable("empId") int id)
	{
		System.out.println("empid"+id);
		System.out.println("bcgservice.checkstatus(id)"+bcgservice.checkstatus(id));
		//return bcgservice.checkstatus(id);
		return bcgservice.checkstatus(id);			
	}

	@GetMapping("/Status/{empId}") 
	public ResponseEntity<String>status(@PathVariable("empId") int id)
	{
		ResponseEntity< String> result = new ResponseEntity<String>(bcgservice.status(id),HttpStatus.OK);
		return result;
		
	}



}