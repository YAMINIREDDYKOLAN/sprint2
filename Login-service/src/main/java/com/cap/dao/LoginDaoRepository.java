package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cap.entity.LoginDto;

public interface LoginDaoRepository extends JpaRepository<LoginDto,Integer> {

	@Query("select login from LoginDto login  where EmpId=?1 and password=?2")
	
	LoginDto authentication(int empId, String password);

}
