package com.javaCodeCompanions.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaCodeCompanions.entity.Student;
import com.javaCodeCompanions.service.StudentServiceImpl;
@RestController
@RequestMapping("/api/student")
@CrossOrigin
public class StudentRestControllerImpl implements StudentRestControllerInteface {
	@Autowired
	private StudentServiceImpl stdService;

	@Override
	@PostMapping("/addStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(stdService.addStudent(student), HttpStatus.CREATED);

	}

	@Override
	@GetMapping("/find/{stdId}")
	public ResponseEntity<Optional<Student>> findStudentById(@PathVariable String stdId) {
		return new ResponseEntity<Optional<Student>>(stdService.findStudentById(stdId), HttpStatus.OK);
	}

	@Override
	@DeleteMapping("/delete/{stdId}")
	public ResponseEntity<String> deleteStudentById(@PathVariable String stdId) {
		return new ResponseEntity<String>(stdService.deleteStudentById(stdId), HttpStatus.NO_CONTENT);

	}

	@Override
	@PutMapping("/updateStudent")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		Student updateStudent = stdService.updateStudent(student);
		return new ResponseEntity<Student>(updateStudent, HttpStatus.OK);
	}

	@Override
	@GetMapping("/findAll")
	public ResponseEntity<Iterable<Student>> findAllStudents() {
		Iterable<Student> allStudents = stdService.findAllStudents();
		return new ResponseEntity<Iterable<Student>>(allStudents, HttpStatus.OK);
	}
	@GetMapping("/test")
	public String test() {
		return "Hi from Student";
	}

}
