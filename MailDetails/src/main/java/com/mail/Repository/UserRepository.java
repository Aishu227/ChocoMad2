package com.mail.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mail.dao.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}