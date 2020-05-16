package com.cap.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="verification5")
public class VerificationDto
{
	
	@Id
	@Column(name="empId",length=15)
	private int empId;
	
	@Column(name="status",length=5) 
	private String status;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	}

