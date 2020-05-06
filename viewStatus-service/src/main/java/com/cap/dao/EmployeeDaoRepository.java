package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cap.entity.VerificationDto;

import org.springframework.data.jpa.repository.JpaRepository;

	//import org.springframework.data.jpa.repository.Query;

public interface EmployeeDaoRepository extends JpaRepository<VerificationDto,Integer>{



		/*@Query("select e from VerificationDto e where empid=?1 ")

		VerificationDto checkstatus(int id);*/



	}
	




