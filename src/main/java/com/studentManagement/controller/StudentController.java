package com.studentManagement.controller;


import com.studentManagement.dto.StudentDTO;
import com.studentManagement.entites.Student;
import com.studentManagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/My-Student")
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/")
    public String save(@RequestBody Student student){
       Student student1 = studentService.save(student);
        return student1.getName();
    }
    @GetMapping("/")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("/{id}")
    public Student getFindById(@PathVariable Integer id){
        return studentService.getFinById(id);
    }
    @PutMapping("/")
    public Student updateStudent(@RequestBody Student student){
         Student student1 = studentService.save(student);
         return student1;
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@RequestParam Integer id){
        studentService.deleteStudent(id);
    }

//------------------------------------------------------------------------------------------------------------
    @PostMapping("/search")
    public List<Student> search(@RequestBody StudentDTO studentDTO){
        return studentService.search(studentDTO);
    }
    @GetMapping("/sort/{field1},{field2}")
    public List<Student> sortByName(@PathVariable String field1, @PathVariable String field2){
        return studentService.sortByField(field1,field2);
        //return studentService.sortByField();
    }
}
