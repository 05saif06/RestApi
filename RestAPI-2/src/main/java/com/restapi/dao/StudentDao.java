package com.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}
