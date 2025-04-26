/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Student_Management.Controller;

import com.example.Student_Management.Model.Student;
import com.example.Student_Management.Service.StudentService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tanne
 */
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentservice;
    
    @GetMapping
    public List<Student> getAllStudents(){
        return studentservice.getAllStudents();
    }
    
    
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return studentservice.getStudentById(id);
    }
    
    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentservice.createStudent(student);
    }
    
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,@RequestBody Student student){
        return studentservice.updateStudent(id,student);
    }
    
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
         studentservice.deleteStudent(id);
    }
    
}
