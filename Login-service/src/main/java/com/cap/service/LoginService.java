package com.cap.service;

import com.cap.bean.LoginDto;

public interface LoginService {

	LoginDto authentication(int id, String pass);

}
