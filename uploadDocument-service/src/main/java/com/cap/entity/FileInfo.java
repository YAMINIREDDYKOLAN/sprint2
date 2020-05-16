package com.cap.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.GenericGenerator;

public class FileInfo {
  
  private String url;
  @Id
  int empId;
  String empName;
  @GeneratedValue(generator="system-uuid")
  @GenericGenerator(name="system-uuid",strategy="uuid")
  int docId;
  String docType;
  @Lob byte[] docData;

 
public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getDocId() {
	return docId;
}
public void setDocId(int docId) {
	this.docId = docId;
}
public String getDocType() {
	return docType;
}
public void setDocType(String docType) {
	this.docType = docType;
}

	    
}



