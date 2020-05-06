package com.cap.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import com.cap.entity.VerificationDto;


public interface StatusDao  extends JpaRepository<VerificationDto,Integer>{

	@Query("select e from VerificationDto e where empId=?1")

	VerificationDto checkstatus(int id);



	

}
