package com.mail.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mail 
{
	private String username;
	@Id
	private String password;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
