package com.example.studentmanager.controllers;

import com.example.studentmanager.database.entities.Student;
import com.example.studentmanager.dto.student.request.StudentDataForAddStudentRequest;
import com.example.studentmanager.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;
    @Autowired
    StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping("")
    @ResponseBody
    public List<Student> getListStudent(){
        return this.studentService.getAllStudent();
    }

    @PostMapping("")
    @ResponseBody
    public String addStudent(@RequestBody StudentDataForAddStudentRequest studentDataForAddStudentRequest){
        System.out.println(studentDataForAddStudentRequest.toString());
        return "add student";
    }


}
