package com.spring_project.SpringProject.student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;
    public StudentController(){
        this.studentService = null;}
    @Autowired    
    public StudentController(StudentService studentService){
          this.studentService=studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
      return studentService.getStudents();
    }
   
}
