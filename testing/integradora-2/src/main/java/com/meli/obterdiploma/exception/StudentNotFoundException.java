package com.meli.obterdiploma.exception;

import org.springframework.http.HttpStatus;

public class StudentNotFoundException extends ObterDiplomaException {

    public StudentNotFoundException(Long id) {
        super("Student id: " + id + " not found.", HttpStatus.NOT_FOUND);
    }
}
