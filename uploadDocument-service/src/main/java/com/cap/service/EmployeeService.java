package com.cap.service;



import org.springframework.web.multipart.MultipartFile;



import com.cap.entity.EmployeeDocumentDto;

import com.cap.entity.VerificationDto;



public interface EmployeeService {

EmployeeDocumentDto uploadFile(MultipartFile file, String user);



	



}