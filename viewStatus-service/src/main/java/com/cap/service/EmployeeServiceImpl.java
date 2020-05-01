package com.cap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.VerificationDto;
import com.cap.dao.EmployeeDaoRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDaoRepository statusdao;
	@Override
	public VerificationDto checkstatus(int id) {
		// TODO Auto-generated method stub
		return statusdao.findOne(id);
	}

}
