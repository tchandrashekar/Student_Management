/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Student_Management.Repository;

import com.example.Student_Management.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tanne
 */
public interface StudentRepository extends JpaRepository<Student,Long>{
    
}
