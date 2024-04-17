package com.javaCodeCompanions.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javaCodeCompanions.entity.Student;

@Service
public interface StudentServiceInteface {
	//add student details
	public Student addStudent(Student student);
	//search student details
	public Optional<Student> findStudentById(String stdId);
	//delete student details
	public String deleteStudentById(String stdId);
	//update student details
	public Student updateStudent(Student student);
	//search all student
	public Iterable<Student> findAllStudents();
		
}
