package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.example.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long>,JpaRepository<Student, Long>
{

	Student findById(long id);
	Student findByBatch(String batch);	
}
