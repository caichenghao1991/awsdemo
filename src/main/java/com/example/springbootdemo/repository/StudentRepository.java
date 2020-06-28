package com.example.springbootdemo.repository;

import com.example.springbootdemo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource //generate api automatically
public interface StudentRepository extends CrudRepository<Student, Long> {
}
