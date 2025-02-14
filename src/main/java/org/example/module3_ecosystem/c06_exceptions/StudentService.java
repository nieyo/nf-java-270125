package org.example.module3_ecosystem.c06_exceptions;

import java.util.List;
import java.util.UUID;

public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
        return repo.save(studentToSave);
    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }

    public Student findById(String id) throws StudentNotFoundException {
        for (Student student : repo.getAllStudents()) {
            if (student.id().equals(id)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with ID " + id + " not found");
    }
}
