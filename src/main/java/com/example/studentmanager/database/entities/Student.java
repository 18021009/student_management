package com.example.studentmanager.database.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "fullName")
    private String fullName;
    @Column(name = "dateOfBirth")
    private Date dateOfBirth;
    private String sex;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "universityName")
    private String universityName;
    @Column(name = "gradeLevel")
    private int gradeLevel;
    private double gpa;
    @Column(name = "bestRewardName")
    private String bestRewardName;
    @Column(name = "englishScore")
    private double englishScore;
    @Column(name = "entryTestScore")
    private double entryTestScore;
    @Column(name = "classId")
    private long classId;
}
