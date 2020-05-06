package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.entity.VerificationDto;
import com.cap.service.EmployeeService;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/bgv")
@CrossOrigin("http://localhost:4200")

public class EmployeeController
{
	@Autowired
	EmployeeService bcgservice;

	 @GetMapping(value="/checkStatus/{enter-empid}")
		public ResponseEntity<VerificationDto> checkstatus(@PathVariable("enter-empid") int id)
		{
		     	VerificationDto verobj=bcgservice.checkstatus(id);
				ResponseEntity<VerificationDto> response1=new ResponseEntity<VerificationDto>(verobj,HttpStatus.OK);
				return response1;
			}
	    
		
}