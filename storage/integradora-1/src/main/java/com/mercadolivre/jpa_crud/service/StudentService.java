package com.mercadolivre.jpa_crud.service;

import com.mercadolivre.jpa_crud.model.Student;
import com.mercadolivre.jpa_crud.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService implements IStudentService{

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> getStudents() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {
        //newDni.ifPresent(student::setDni);
        //newName.ifPresent(student::setName);
        //newLastName.ifPresent(student::setLastName);
        studentRepository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Student findStudent(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
}
