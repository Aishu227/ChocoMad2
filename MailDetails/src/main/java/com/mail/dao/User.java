package com.mail.dao;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	@Id
	private String aadharno;
    private String name;
    private String dob;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="username")
    private Mail username;
	public Mail getUsername() {
		return username;
	}
	public void setUsername(Mail username) {
		this.username = username;
	}
	public String getAadharno() {
		return aadharno;
	}
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}