package com.meli.obterdiploma;

import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.model.SubjectDTO;
import com.meli.obterdiploma.repository.IStudentDAO;
import com.meli.obterdiploma.repository.StudentRepository;
import com.meli.obterdiploma.service.ObterDiplomaService;
import com.meli.obterdiploma.service.StudentService;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Properties;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    @Mock
    IStudentDAO iStudentDAO;

    @InjectMocks
    StudentService studentService;;

    // Arrange
    public SubjectDTO materia1 = new SubjectDTO("Matemática", 10.0);
    public SubjectDTO materia2 = new SubjectDTO("Português", 10.0);
    public SubjectDTO materia3 = new SubjectDTO("Inglês", 10.0);
    public StudentDTO studentDTO = new StudentDTO(
            1L,
            "Rafael",
            "Aluno Teste",
            null,
            Arrays.asList(materia1, materia2, materia3)
    );

    @Test
    @DisplayName("This test should fail")
    public void shouldTryCreateStudent(){

        doNothing().when(iStudentDAO).save(any());

        studentService.create(studentDTO);

        verify(iStudentDAO, times(1)).save(studentDTO);

    }


}
