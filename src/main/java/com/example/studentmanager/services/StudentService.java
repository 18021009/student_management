package com.example.studentmanager.services;

import com.example.studentmanager.database.entities.Student;
import com.example.studentmanager.repositories.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
}
