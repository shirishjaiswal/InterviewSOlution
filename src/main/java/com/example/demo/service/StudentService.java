package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;
    public String addStudentData(Student student) {
        studentRepo.save(student);
        return "Added successfully";
    }

    public Student getStudentData(int id) {
        Student student= studentRepo.findById(id).get();
        return student;
    }

    public String updateStudentData(Student student, int id) {
        Student student1= studentRepo.findById(id).get();
        student1.setName(student.getName());
        student1.setEmail(student.getEmail());
        student1.setUserName(student.getUserName());
        studentRepo.save(student1);
        return "student id "+id+" updated";
    }

    public String deleteStudentData(int id) {
        studentRepo.deleteById(id);
        return "Student id "+id+" deleted";
    }
}
