package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.bean.EmployeeDocumentDto;

public interface EmployeeDaoRepository extends JpaRepository<EmployeeDocumentDto,Integer>{

}
