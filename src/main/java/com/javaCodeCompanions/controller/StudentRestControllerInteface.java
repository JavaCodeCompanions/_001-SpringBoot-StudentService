package com.javaCodeCompanions.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.javaCodeCompanions.entity.Student;
@RestController
public interface StudentRestControllerInteface {
	//add student details
		public ResponseEntity<Student> addStudent(Student student);
		//search student details
		public ResponseEntity<Optional<Student>> findStudentById(String stdId);
		//delete student details
		public ResponseEntity<String> deleteStudentById(String stdId);
		//update student details
		public ResponseEntity<Student> updateStudent(Student student);
		//search all student
		public ResponseEntity<Iterable<Student>> findAllStudents();
}
