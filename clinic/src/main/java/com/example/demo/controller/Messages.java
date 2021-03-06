package com.example.demo.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.AppConfig;

@Entity
public class Messages {
	
//	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//	Details details = applicationContext.getBean(Details.class);
		
	@Id
	@Column(name="message_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long message_id;
	private String clinicname;
	private String person_name;
	private String timestamp;
	@ManyToOne
	private Details detail;
	
//	@OneToOne - two table columns mapped one on one (Messages - Details)
//	@JoinColumn(name="id",referencedColumnName="id") - map 'id' column in Messages to 'id' column in Details
	
	public Messages() {
		
	}
	
	public Messages(Long message_id, String clinicname, String person_name, String timestamp, Details detail) {
		super();
		this.message_id = message_id;
		this.clinicname = clinicname;
		this.person_name = person_name;
		this.timestamp = timestamp;
		this.detail = new Details(0L, clinicname, "", "", "", "");
	}
	
	public Long getMessage__Id() {
		return message_id;
	}
	public void setMessage__Id(Long message_id) {
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
