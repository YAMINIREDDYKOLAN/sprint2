package com.cap.service;

import com.cap.entity.VerificationDto;

public interface EmployeeService {

	String checkstatus(int id);

	String status(int id);

	VerificationDto check(int id);

}
