package com.cap.entity;

import java.sql.Date;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.SequenceGenerator;

import javax.persistence.Table;



@Entity

@Table(name="verificationtable")

@SequenceGenerator(name="seq1", initialValue=101, allocationSize=200)

public class VerificationDto

{

	

	@Id

	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq1") 

	private int verfId;

	private Date startDate;

	private Date endDate;

	private String status;

	public Date getStartDate() {

		return startDate;

	}

	public void setStartDate(Date startDate) {

		this.startDate = startDate;

	}

	public String getStatus() {

		return status;

	}

	public void setStatus(String status) {

		this.status = status;

	}

	public Date getEndDate() {

		return endDate;

	}

	public void setEndDate(Date endDate) {

		this.endDate = endDate;
	}
}