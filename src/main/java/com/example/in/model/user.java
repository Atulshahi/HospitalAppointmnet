package com.example.in.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class user {
	
	
	@Id
	@Column(name="emailid")
	String emailid;

	@Column(name="phonenumber")
	int phonenumber;
	
	@Column(name="name")
	String name;
	
	@Column(name="password")
	String password;
	
	
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public user(int phonenumber, String name, String emailid, String password) {
		super();
		this.phonenumber = phonenumber;
		this.name = name;
		this.emailid = emailid;
		this.password = password;
	}


	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
