package com.example.demo.controller;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addData(@RequestBody Student student){
        return studentService.addStudentData(student);
    }

    @GetMapping("/get/{id}")
    public Student getData(@PathVariable int id){
        return studentService.getStudentData(id);
    }

    @PutMapping("/update/{id}")
    public String updateData(@RequestBody Student student,@PathVariable int id){
        return studentService.updateStudentData(student,id);
    }

    @DeleteMapping("del/{id}")
    public String deleteData(@PathVariable int id){
        return studentService.deleteStudentData(id);
    }
}
