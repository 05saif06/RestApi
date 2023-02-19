package com.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.dao.StudentDao;
import com.restapi.entity.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao dao;

	public Student createNewStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.save(student);
	}

}
