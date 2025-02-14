package org.example.module3_ecosystem.c06_exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    StudentService studentService = new StudentService();

    Student newStudent = Student.builder()
            .id("1")
            .name("Jonas")
            .build();

    Student savedStudent = studentService.addNewStudent(newStudent);

    @Test
    void findById_existingStudent_returnsStudent() throws StudentNotFoundException {
        Student result = studentService.findById(savedStudent.id());
        assertNotNull(result);
        assertEquals(savedStudent.id(), result.id());
        assertEquals("Jonas", result.name());
    }

    @Test
    void findById_nonExistingStudent_throwsStudentNotFoundException() {
        assertThrows(StudentNotFoundException.class, () -> studentService.findById("999"));
    }
}