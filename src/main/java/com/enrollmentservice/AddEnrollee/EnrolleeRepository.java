package com.enrollmentservice.AddEnrollee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrolleeRepository extends  JpaRepository<Enrollee, Long>{
  Enrollee findById(long id);
  
  void saveEnrollee(Enrollee entities);
}

