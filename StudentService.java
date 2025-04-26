/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Student_Management.Service;

import com.example.Student_Management.Model.Student;
import com.example.Student_Management.Repository.StudentRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tanne
 */
@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentrepository;
    
    public List<Student> getAllStudents(){
        return studentrepository.findAll();
    }

    public Student createStudent(Student student) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return studentrepository.save(student);  
    }

    public Student updateStudent(Long id,Student studentdetails) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       studentdetails.setId(id);
       return studentrepository.save(studentdetails);
    }

    public void deleteStudent(Long id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        studentrepository.deleteById(id);
    }

    public Optional<Student> getStudentById(Long id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return studentrepository.findById(id);
    }
    
    
    
    
}
