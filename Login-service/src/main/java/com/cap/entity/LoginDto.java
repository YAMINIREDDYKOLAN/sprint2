package com.cap.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="login")
public class LoginDto 
{

	@Id
	int EmpId;
	String password;
	//int roleId;
	
	/*
	 * public int getRoleId() { return roleId; } public void setRoleId(int roleId) {
	 * this.roleId = roleId; }
	 */
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		this.EmpId = empId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
