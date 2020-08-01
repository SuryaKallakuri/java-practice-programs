package com.letsstartcoding.springbootRestApi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootRestApi.model.Student;
import com.letsstartcoding.springbootRestApi.repository.StudentRepository;

//Data Access Object -- insert, search, get, update data from database
//using model class and studentRepository we insert data into database

@Service
public class StudentDAO {

	@Autowired
	StudentRepository studentRepository; // created StudentRepository object

	// to save a student

	public Student save(Student std) { // we pass student object to save and using Hibernate and JPA properties
										// Springboot will automatically insert data into DB
		return studentRepository.save(std); // predefined method in JpaRepository
	}

	// search all students

	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	// get a student

	public Student findOne(Long stdid) {
		return studentRepository.findOne(stdid);
	}

	// delete a student

	public void delete(Student std) {
		studentRepository.delete(std);
	}

}
