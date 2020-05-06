package com.cap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.LoginDaoRepository;
import com.cap.entity.LoginDto;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDaoRepository logindao;
	
	public LoginDto authentication(int id, String pass) {
		// TODO Auto-generated method stub
		return logindao.authentication( id,pass);
	}

}
