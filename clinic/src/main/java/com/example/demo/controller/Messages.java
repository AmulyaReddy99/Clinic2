package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Messages {
		
	@Id
	private String message_id;
	private String clinicname;
	private String person_name;
	private String timestamp;
	@ManyToOne
	private Details detail;
	
	public Messages() {
		
	}
	
	public Messages(String message_id, String clinicname, String person_name, String timestamp, Details detail) {
		super();
		this.message_id = message_id;
		this.clinicname = clinicname;
		this.person_name = person_name;
		this.timestamp = timestamp;
		this.detail = new Details(clinicname, "", "", "", "");
	}
	
	public String getMessage_id() {
		return message_id;
	}
	public void setMessage_id(String message_id) {
		this.message_id = message_id;
	}
	public String getclinicName() {
		return clinicname;
	}
	public void setclinicName(String clinicname) {
		this.clinicname = clinicname;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
}
