package com.spring_project.SpringProject.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
     public List<Student> getStudents(){
         return List.of(new Student(2L,"Retam","retamphy@gmail.com",LocalDate.of(2004,Month.OCTOBER,11),21));
    } 

}
