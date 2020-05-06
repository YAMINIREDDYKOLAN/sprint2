package com.cap.service;

import com.cap.entity.LoginDto;

public interface LoginService {

	LoginDto authentication(int id, String pass);

}
