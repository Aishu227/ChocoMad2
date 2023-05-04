package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ChocomadModel;
import com.example.demo.service.ChocomadService;

@RestController
public class ChocomadController {
	@Autowired
	ChocomadService chService;
	@GetMapping(value="/fetch")
	public List<ChocomadModel> getAll()
	{
		List<ChocomadModel> chList = chService.getAll();
		return chList;
	}
	
	@PostMapping(value="/save")
	public ChocomadModel save(@RequestBody ChocomadModel s)
	{
		return chService.save(s);
	}
	
	@PutMapping(value="/update")
	public ChocomadModel update(@RequestBody ChocomadModel s)
	{
		return chService.save(s); 
	}
	@DeleteMapping(value="/delete/{billno}")
	public void delete(@PathVariable("billno") int billno)
	{
		chService.delete(billno);
		
	}
	@GetMapping(value="/get/{billno}")
	public ChocomadModel get(@PathVariable("billno") int billno)
	{
		return chService.get(billno);
	}
	@GetMapping("/auto/{field}")
	public List<ChocomadModel>sortCrudD(@PathVariable String field){
		return chService.sortChoco(field);
	}
	@GetMapping("/autio")
	public List<ChocomadModel>sortCrudDes(@RequestParam String field){
		return chService.sortChoco(field);
	}
	
	
	@GetMapping("/pagination")
	
	public List<ChocomadModel> pagination(@RequestParam int offset,@RequestParam int pagesize){
		
		return chService.getpaginationss(offset,pagesize);
	}
	
	@GetMapping("/sortpagination")
	
	public List<ChocomadModel> sortpagination(@RequestParam int offset,@RequestParam int pagesize,String field){
		
		return chService.getsortpaginations(offset,pagesize,field);
	}
	@DeleteMapping("/deleteByName1/{name}")
	public String deleteByName(@PathVariable String name)
	{
	int result=chService.deleteByName(name);
	if(result >0)
		return "Customer record deleted";
	else
		return "Problem occured while deleting";
	}
	
	@GetMapping("/fetchAll")
	   public List<ChocomadModel> fetchAll()
	   {
		  return  chService.fetchAll();
	   }  
	@PostMapping("/saveAll")
	   public ChocomadModel saveAll(@RequestBody ChocomadModel s)
	   {
	  	 return chService.saveAll(s);
	   }

}

