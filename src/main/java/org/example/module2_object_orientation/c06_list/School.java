package org.example.module2_object_orientation.c06_list;

import java.util.ArrayList;
import java.util.Comparator;

public class School {

    private ArrayList<Student> students;


    public School() {
        students = new ArrayList<>();
    }

    public void addClassOfStudents(ArrayList<Student> list) {
        students.addAll(list);
        students.sort(Comparator.comparing(Student::getStudentID));
    }

    public void addStudent(Student student) {
        students.add(student);
        students.sort(Comparator.comparing(Student::getStudentID));
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

    public Student findStudentByID(String id) {
        for (Student student : students) {
            if (student.getStudentID().equals(id)) {
                return student;
            }
        }
        return null;
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
