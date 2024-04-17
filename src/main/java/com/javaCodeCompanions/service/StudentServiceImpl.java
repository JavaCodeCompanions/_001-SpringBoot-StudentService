package com.javaCodeCompanions.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaCodeCompanions.entity.Student;
import com.javaCodeCompanions.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentServiceInteface {

	@Autowired
	private StudentRepo stdRepo;

	@Override
	public Student addStudent(Student student) {
		Student addedStudent = null;
		if (student != null) {
			addedStudent = stdRepo.save(student);
		}
		return addedStudent;
	}

	@Override
	public Optional<Student> findStudentById(String stdId) {
		Optional<Student> student = null;
		if (stdId != null) {
			student = stdRepo.findById(stdId);
		}
		return student;
	}

	@Override
	public String deleteStudentById(String stdId) {
		String deletedStudent = null;
		if (stdId != null) {
			stdRepo.deleteById(stdId);
			return "Entry Deleted";
		}
		return deletedStudent;
	}

	@Override
	public Student updateStudent(Student student) {
		Student updatedStudent = null;
		if (student != null) {
			updatedStudent = stdRepo.save(student);
		}
		return updatedStudent;
	}

	@Override
	public Iterable<Student> findAllStudents() {
		Iterable<Student> allStudents = stdRepo.findAll();
		return allStudents;
	}

}
