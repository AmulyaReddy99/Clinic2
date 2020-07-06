package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Details {
	
	@Id
	private String clinicname;
	private String type;
	private String status;
	private String ph_no;
	private String address;
	
	public Details() {
		
	}
	

	public Details(String clinicname, String type, String status, String ph_no, String address) {
		super();
		this.clinicname = clinicname;
		this.type = type;
		this.status = status;
		this.ph_no = ph_no;
		this.address = address;
	}
	
	
	public String getclinicName() {
		return clinicname;
	}
	public void setclinicName(String clinicname) {
		this.clinicname = clinicname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPh_no() {
		return ph_no;
	}
	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
