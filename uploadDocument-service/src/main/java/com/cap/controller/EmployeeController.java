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

import com.cap.bean.EmployeeDocumentDto;
import com.cap.bean.Response;
import com.cap.service.EmployeeService;

//@SuppressWarnings("unused")
@RestController
@RequestMapping("/bgv")
//@CrossOrigin("http://localhost:4200")

public class EmployeeController {

	@Autowired 
	EmployeeService bcgservice;

	@PostMapping(value="/uploadFile/{emp-id}/{emp-name}",consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Response> uploadingFile(@RequestParam("file") MultipartFile file, @PathVariable("emp-id") int empid,@PathVariable("emp-name") String empname) throws IOException
    {
    	EmployeeDocumentDto  dbfile =new  EmployeeDocumentDto();
    	//dbfile.setFileName(file.getOriginalFilename());
    	dbfile.setDocData(file.getBytes());
    	dbfile.setDocType("image");
    	dbfile.setEmpId(empid);
    	dbfile.setEmpName(empname);
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
