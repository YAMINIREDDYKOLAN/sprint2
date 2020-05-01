package com.cap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.bean.LoginDto;
import com.cap.dao.LoginDaoRepository;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDaoRepository logindao;
	@Override
	public LoginDto authentication(int id, String pass) {
		// TODO Auto-generated method stub
		return logindao.authentication( id,pass);
	}

}
