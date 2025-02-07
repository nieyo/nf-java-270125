package org.example.module2_object_orientation.c07_set_and_map.school;

import java.util.ArrayList;
import java.util.HashMap;

public class School {

    private HashMap<String, Student> students;


    public School() {
        students = new HashMap<>();
    }

    public void addClassOfStudents(ArrayList<Student> list) {
        for (Student student : list) {
            students.put(student.getStudentID(), student);
        }
    }

    public void addStudent(Student student) {
        students.put(student.getStudentID(), student);
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

    public Student findStudentByID(String id) {
        return students.get(id);
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }

    public void printCoursesOfStudentByID(String id) {
        Student student = findStudentByID(id);
        System.out.println(student.getFirstName() + " " + student.getLastName() + "'s Courses:");
        ArrayList<Course> courses = student.getCourses(); // return student.getCourses(), if ArrayList of courses is needed as return value
        for (Course course : courses) {
            System.out.println(course.getCourseName() + " with " + course.getInstructor());
        }
    }
}
