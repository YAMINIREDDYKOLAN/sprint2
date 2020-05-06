package com.cap.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cap.entity.EmployeeDocumentDto;
import com.cap.entity.Response;
import com.cap.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/bgv")
@CrossOrigin("http://localhost:4200")

public class EmployeeController {

	@Autowired 
	EmployeeService bcgservice;

	@PostMapping(value="/uploadFile",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Response> uploadingFile(@RequestParam("file") MultipartFile file, @RequestParam("user") String user) throws IOException
    {
    	EmployeeDocumentDto  dbfile =new  ObjectMapper().readValue(user, EmployeeDocumentDto.class);
    	
    	EmployeeDocumentDto dbperson=bcgservice.save(dbfile);
    	if(dbperson!=null)
    	{
    		return new ResponseEntity<Response>(new Response("successfull"),HttpStatus.OK);
    	}
    	else
    	{
    	return new ResponseEntity<Response>(new Response("unsuccessfull"),HttpStatus.BAD_REQUEST);
    	}
    }
    
}
