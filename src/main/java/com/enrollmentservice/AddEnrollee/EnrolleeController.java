package com.enrollmentservice.AddEnrollee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrolleeController {
	
	@Autowired
	  private Environment environment;
	  
	  @Autowired
	  private EnrolleeRepository repository;
	  
	  @GetMapping("/Enrollee/{id}")
	  public Enrollee retrieveEnrollee
	    ( @PathVariable long id){
	    
	    Enrollee enrolleevalue = 
	        repository.findById(id);
	    
	    enrolleevalue.setPort(
	        Integer.parseInt(environment.getProperty("local.server.port")));
	    
	    return enrolleevalue;
	  }
	  
	  @PostMapping(path = "/Enrollee", consumes = "application/json", produces = "application/json")
	  public void AddingEnrollee
	    (@RequestBody Enrollee enrollee){
	    
	    Enrollee enrolleevalue2 = 
	        repository.save(enrollee);
	    
	    enrolleevalue2.setPort(
	        Integer.parseInt(environment.getProperty("local.server.port")));
	    
	   	  }
	}

