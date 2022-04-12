package com.mercadolivre.jpa_crud.service;

import com.mercadolivre.jpa_crud.model.Student;

import java.util.List;

public interface IStudentService {

    List<Student> getStudents();
    void saveStudent(Student student);
    void deleteStudent(Long id);
    Student findStudent(Long id);
}
