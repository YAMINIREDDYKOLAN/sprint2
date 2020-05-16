package com.cap.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cap.dao.EmployeeDaoRepository;
import com.cap.entity.VerificationDto;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDaoRepository statusdao;

	@Override
	public String checkstatus(int id) {

		System.out.println("INside service layer"+statusdao.checkstatus(id));

		return statusdao.checkstatus(id);
	}

	@Override
	public String status(int id)
	{ 
		VerificationDto s=check(id);
		return s.getStatus(); 
	}
	@Override
	public VerificationDto check(int id) {
		VerificationDto verobj=statusdao.getOne(id);
		return verobj;
	}
}

/*public VerificationDto checkstatus(int id) {
		VerificationDto verobj=statusdao.findOne(id);
		return verobj;
	}*/

