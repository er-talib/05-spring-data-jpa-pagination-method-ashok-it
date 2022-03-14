package com.pagination.method.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pagination.method.jpa.entityes.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
