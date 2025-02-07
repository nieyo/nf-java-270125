package org.example.module2_object_orientation.c06_list;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private ArrayList<Course> courses;

    public Student(String firstName, String lastName, String studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }

    public String getStudentID() {
        return studentID;
    }

    public void addStudentToCourse(Course course){
        courses.add(course);
        // System.out.println(firstName + " " + lastName + " was added to the course: " + course.getCourseName());
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
