package com.cap.service;



import java.io.IOException;

import java.sql.Date;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;



import com.cap.dao.EmployeeDaoRepository;
import com.cap.dao.StatusDao;


import com.cap.entity.EmployeeDocumentDto;

import com.cap.entity.VerificationDto;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.JsonMappingException;

import com.fasterxml.jackson.databind.ObjectMapper;



@Service

public class EmployeeServiceImpl implements EmployeeService {

@Autowired

EmployeeDaoRepository employeedao;

@Autowired 

StatusDao statusdao;



public EmployeeDocumentDto uploadFile(MultipartFile file, String user) {

	EmployeeDocumentDto dbfile=new  EmployeeDocumentDto();

	try {

		dbfile = new ObjectMapper().readValue(user, EmployeeDocumentDto.class);

	} catch (JsonMappingException e) {

				e.printStackTrace();

	} catch (JsonProcessingException e) {

			e.printStackTrace();

	} catch (IOException e) {
		e.printStackTrace();

	}

dbfile.setDocType(file.getOriginalFilename());

employeedao.save(dbfile);

VerificationDto verobj=new VerificationDto();

verobj.setStatus("pending");

long millis=System.currentTimeMillis();  

Date startdate=new Date(millis); 

verobj.setStartDate(startdate);

statusdao.save(verobj);



	return dbfile;

}

	

}
	