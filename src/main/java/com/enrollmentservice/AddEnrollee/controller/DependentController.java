package com.enrollmentservice.AddEnrollee.controller;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.enrollmentservice.AddEnrollee.Enrollee.Enrollee;
import com.enrollmentservice.AddEnrollee.Repository.DependentRepository;
import com.enrollmentservice.AddEnrollee.Repository.EnrolleeRepository;

@RestController
public class DependentController {
	

	@Autowired
	  private Environment environment;
	  
	  @Autowired
	  private DependentRepository dependentrepository;
	  
	  @GetMapping("/Enrollee/{id}")
	  public Enrollee retrieveEnrollee
	    ( @PathVariable long id){
	    
	    Enrollee enrolleevalue = 
	        repository.findById(id);
	    
	    enrolleevalue.setPort(
	        Integer.parseInt(environment.getProperty("local.server.port")));
	    
	    return enrolleevalue;
	  }
	  
	  @GetMapping("/Enrollee")
	  public List<Enrollee> retrieveEnrollee(){
	    
	    List<Enrollee> enrolleevalue = 
	        repository.findAll();
	 
	    return enrolleevalue;
	  }
	  
	  @PostMapping("/Enrollee")
	  public ResponseEntity<Object> createEnrollee (@RequestBody Enrollee enrollee){
		  
		  Map<Long, Enrollee> EnrolleeRepo = new HashMap<>();
		  
		  EnrolleeRepo.put(enrollee.getId(), enrollee);
	    Enrollee enrolleevalue2 =  repository.save(enrollee);
	   
	    
	    enrolleevalue2.setPort(
	        Integer.parseInt(environment.getProperty("local.server.port")));
	    
	    return new ResponseEntity<>("Enrollee is created successfully", HttpStatus.CREATED);
	   	  
	  }
	  
	  @DeleteMapping("/Enrollee/{id}")
	  public void deleteStudent(@PathVariable long id) {
	  	repository.deleteById(id);
	  }
	  
	  @PutMapping("/Enrollee/{id}")
	  public ResponseEntity<Object> updateStudent(@RequestBody Enrollee enrolle, @PathVariable long id) {

	  	Enrollee studentOptional = repository.findById(id);

	  	if (studentOptional.equals(null)) {
	  		return ResponseEntity.notFound().build();}

	  	enrolle.setId(id);
	  	
	  	repository.save(enrolle);

	  	return ResponseEntity.noContent().build();
	  }
	}

