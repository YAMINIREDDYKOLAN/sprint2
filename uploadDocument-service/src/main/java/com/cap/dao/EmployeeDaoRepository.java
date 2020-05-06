package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.entity.EmployeeDocumentDto;

public interface EmployeeDaoRepository extends JpaRepository<EmployeeDocumentDto,Integer>{

}
