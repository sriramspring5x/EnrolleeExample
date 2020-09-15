package com.enrollmentservice.AddEnrollee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface DependentRepository  extends JpaRepository<Dependent_Enrolle, Long>, QueryByExampleExecutor<Dependent_Enrolle>{
	
	Dependent_Enrolle findById(long id);
	  
	Dependent_Enrolle save(Dependent_Enrolle entities);
		 
	}