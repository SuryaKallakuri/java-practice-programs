package com.letsstartcoding.springbootRestApi.repository;

import com.letsstartcoding.springbootRestApi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
