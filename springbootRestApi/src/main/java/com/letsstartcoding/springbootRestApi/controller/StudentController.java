package com.letsstartcoding.springbootRestApi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsstartcoding.springbootRestApi.dao.StudentDAO;
import com.letsstartcoding.springbootRestApi.model.Student;

//this is where all the urls entered from the browser or API testing tools (postman) will be handled
@RestController
@RequestMapping("/university")
public class StudentController { // controller will access the DAO

	@Autowired
	StudentDAO studentDAO; // create DAO object

	// save a student into database
	@PostMapping("/students")
	public Student createStudent(@Valid @RequestBody Student std) {
		return studentDAO.save(std);
	}

	// get all students
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentDAO.findAll();
	}

	// get student by stdid
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Long stdid) {
		Student std = studentDAO.findOne(stdid);

		if (stdid == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(std);
	}

	// update an student by stdid
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable(value = "id") Long stdid,
			@Valid @RequestBody Student stdDetails) {

		Student std = studentDAO.findOne(stdid);
		if (std == null) {
			return ResponseEntity.notFound().build();
		}

		std.setName(stdDetails.getName());
		std.setAreaOfStudy(stdDetails.getAreaOfStudy());
		std.setGrade(stdDetails.getGrade());

		Student updateStudent = studentDAO.save(std);
		return ResponseEntity.ok().body(updateStudent);
	}

	// delete a student
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable(value = "id") Long stdid) {
		Student std = studentDAO.findOne(stdid);
		if (std == null) {
			return ResponseEntity.notFound().build();
		}
		studentDAO.delete(std);

		return ResponseEntity.ok().build();

	}
}
