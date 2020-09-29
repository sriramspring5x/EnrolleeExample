package com.enrollmentservice.AddEnrollee.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.enrollmentservice.AddEnrollee.Enrollee.Enrollee;

public interface EnrolleeRepository extends  JpaRepository<Enrollee, Long>, QueryByExampleExecutor<Enrollee>{
  Enrollee findById(long id);
  
  Enrollee save(Enrollee entities);
	 
}

