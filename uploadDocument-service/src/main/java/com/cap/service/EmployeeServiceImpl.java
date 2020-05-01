package com.cap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.EmployeeDocumentDto;
import com.cap.dao.EmployeeDaoRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDaoRepository empdao;
		@Override
		public EmployeeDocumentDto save(EmployeeDocumentDto dbfile) {
			// TODO Auto-generated method stub
			return empdao.save(dbfile);
		}

}
