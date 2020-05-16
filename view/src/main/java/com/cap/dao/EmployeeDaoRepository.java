package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.entity.VerificationDto;
@Repository
public interface EmployeeDaoRepository extends JpaRepository<VerificationDto,Integer>{
	
	

	//@Query("select v from VerificationDto v  where empId=?1")
	@Query("select v  from VerificationDto v where emp_Id=?1")
	public String checkstatus(int id);

	 @Query("select e from VerificationDto e where empId=?1") public String
	  status(int id);
	 // public VerificationDto checkstatus(int id);
	 	
}
