package com.mail.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail.Service.MailService;
import com.mail.dao.User;


@RestController
public class MailController {

	@Autowired
	MailService dso;
	@GetMapping("/fetchAll")
	   public List<User>fetchAll()
	   {    
		  return dso.fetchAll();
	   }
}
