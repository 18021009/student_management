package com.example.studentmanager.repositories;

import com.example.studentmanager.database.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
