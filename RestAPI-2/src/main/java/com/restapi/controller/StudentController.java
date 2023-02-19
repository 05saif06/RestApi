package com.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.dao.StudentDao;
import com.restapi.entity.Student;
import com.restapi.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	// create a new student into a database.

	@PostMapping("/createNewStudent")
	public ResponseEntity<Student> createNewStudent(@RequestBody Student student) {
		return new ResponseEntity<>(studentService.createNewStudent(student), HttpStatus.ACCEPTED);
	}
	
	

}
