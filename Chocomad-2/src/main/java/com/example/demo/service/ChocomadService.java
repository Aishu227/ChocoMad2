package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import com.example.demo.Model.ChocomadModel;
import com.example.demo.dao.ChocomadRepository;

import jakarta.transaction.Transactional;

@Service
public class ChocomadService {
	@Autowired
	ChocomadRepository chRepository;

	public List<ChocomadModel> getAll()
	{
		List<ChocomadModel> chList = chRepository.findAll();
		return chList;
	}
	
	public ChocomadModel save(ChocomadModel s)
	{
		ChocomadModel obj = chRepository.save(s);
		return obj;
	}
	
	public ChocomadModel update(ChocomadModel s)
	{
		ChocomadModel obj=chRepository.save(s);
		return obj;
	}
	public void delete(int billno)
	{
		chRepository.deleteById(billno);
	}
	

	public ChocomadModel get(int billno)
	{
		ChocomadModel s=chRepository.findById(billno).get();
		return s;
	}
public List<ChocomadModel> sortChoco(String field){
 		
 		return chRepository.findAll(Sort.by(Direction.DESC,field));
 	}

 	public List<ChocomadModel> getpaginationss(int offset, int pagesize) {
 		
 		Page<ChocomadModel> paging=chRepository.findAll(PageRequest.of(offset, pagesize));
 		return paging.getContent();
 	}

 	public List<ChocomadModel> getsortpaginations(int offset, int pagesize,String field) {
 		
 		Page<ChocomadModel> paging=chRepository.findAll(PageRequest.of(offset, pagesize,Sort.by(field)));
 		return paging.getContent();
 	}
 	@Transactional
	 public int deleteByName(String name)
	 {
	 	return chRepository.deleteByName(name);
	 }
	 public List<ChocomadModel> fetchAll()
	 {
		 return chRepository.findAll();
	 }
	 public ChocomadModel saveAll(ChocomadModel s)
	 {
		 return chRepository.save(s);
	 }
}