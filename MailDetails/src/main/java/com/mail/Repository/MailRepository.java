package com.mail.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mail.dao.Mail;

@Repository
public interface MailRepository extends JpaRepository<Mail,Integer>{

}