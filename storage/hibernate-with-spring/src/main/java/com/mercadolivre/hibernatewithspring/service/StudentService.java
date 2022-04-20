package com.mercadolivre.hibernatewithspring.service;

import com.mercadolivre.hibernatewithspring.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService (StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
}
