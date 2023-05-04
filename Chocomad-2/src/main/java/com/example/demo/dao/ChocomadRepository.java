package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.ChocomadModel;

@Repository
public interface ChocomadRepository extends JpaRepository<ChocomadModel,Integer>{

	@Modifying
	@Query("delete  from ChocomadModel s where s.name=?1" )
	public int deleteByName(String name);
	
	@Query("select s from ChocomadModel s where s.name=:name")
	public List<ChocomadModel> get(String name);
	
	


}
