package com.mercadolivre.jpa_crud.controller;

import com.mercadolivre.jpa_crud.model.Student;
import com.mercadolivre.jpa_crud.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping("/create")
    public String createStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "O aluno foi adicionado com sucesso";
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> studentList = studentService.getStudents();
        return studentList;
    }

    @PostMapping("/edit/{id}")
    public Student editStudent(@PathVariable Long id,
                               @RequestParam ("name") String newName,
                               @RequestParam ("lastName") String newLastName){
        Student student = studentService.findStudent(id);
        student.setName(newName);
        student.setLastName(newLastName);
        studentService.saveStudent(student);
        return student;
    }

    @PostMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "O aluno foi excluído com sucesso";
    }
}
