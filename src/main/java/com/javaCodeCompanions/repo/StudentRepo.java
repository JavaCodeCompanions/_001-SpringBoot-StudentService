package com.javaCodeCompanions.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.javaCodeCompanions.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Serializable> {

}
