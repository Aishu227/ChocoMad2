package com.mail.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mail.Repository.UserRepository;
import com.mail.dao.User;


@Service

public class MailService {
	@Autowired
	UserRepository repo;
	public List<User> fetchAll()
	 { 
		 return repo.findAll();
	 }
}