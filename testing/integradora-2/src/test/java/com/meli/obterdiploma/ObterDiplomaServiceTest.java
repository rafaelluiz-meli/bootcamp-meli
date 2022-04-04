package com.meli.obterdiploma;

import com.meli.obterdiploma.exception.StudentNotFoundException;
import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.model.SubjectDTO;
import com.meli.obterdiploma.repository.IStudentDAO;
import com.meli.obterdiploma.service.ObterDiplomaService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class ObterDiplomaServiceTest {

    @Mock
    IStudentDAO studentDAO;

    @InjectMocks
    ObterDiplomaService obterDiplomaService;

    @Test
    @DisplayName("Should calculate average score of Student")
    public void shouldTryCalculateAverageScore() {

        // Arrange
        SubjectDTO materia1 = new SubjectDTO("Matemática", 10.0);
        SubjectDTO materia2 = new SubjectDTO("Português", 10.0);
        SubjectDTO materia3 = new SubjectDTO("Inglês", 10.0);

        StudentDTO student = new StudentDTO(
                1L,
                "Rafael",
                "Aluno Teste",
                null,
                Arrays.asList(materia1, materia2, materia3)
        );
        Mockito.when(studentDAO.findById(any())).thenReturn(student);

        // Act
        StudentDTO result = obterDiplomaService.analyzeScores(1L);

        // Assert
        assertEquals( 10.0, result.getAverageScore());
    }

    @Test
    @DisplayName("Should message error if student is not found")
    public void shouldTryCalculaScoreWithInvalidStudent() {

        // Arrange
        Long studentId = 1L;

        // Act
        Mockito.when(studentDAO.findById(any())).thenThrow(new StudentNotFoundException(studentId));
        StudentNotFoundException ex = assertThrows(StudentNotFoundException.class,
                () -> obterDiplomaService.analyzeScores(studentId),
                "Student id: " + studentId + " not found.");

        // Assert
        assertTrue(ex.getError().getDescription().contains("Student id: " + studentId + " not found."));
    }

    @Test
    @DisplayName("Should return a average score from list of subjects of one Student")
    public void shouldTryCalculateAverageScores() {

        // Arrange
        SubjectDTO materia1 = new SubjectDTO("Matemática", 5.0);
        SubjectDTO materia2 = new SubjectDTO("Português", 5.0);
        SubjectDTO materia3 = new SubjectDTO("Inglês", 5.0);
        StudentDTO studentDTO = new StudentDTO(
                1L,
                "Rafael",
                "Aluno teste",
                null,
                Arrays.asList(materia1, materia2, materia3)
        );

        Mockito.when(studentDAO.findById(any())).thenReturn(studentDTO);

        // Act
        Double resultOfServiceAnalyseScores =  obterDiplomaService.analyzeScores(any()).getAverageScore();

        // Assert
        assertEquals(5.0, resultOfServiceAnalyseScores);
    }

}
