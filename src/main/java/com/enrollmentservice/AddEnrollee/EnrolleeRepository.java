package com.enrollmentservice.AddEnrollee;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface EnrolleeRepository extends  JpaRepository<Enrollee, Long>, QueryByExampleExecutor<Enrollee>{
  Enrollee findById(long id);
  
  Enrollee save(Enrollee entities);
	 
}

