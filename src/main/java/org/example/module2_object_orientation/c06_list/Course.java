package org.example.module2_object_orientation.c06_list;

public class Course {
    private String courseName;
    private String instructor;
    private String room;

    public Course(String courseName, String instructor, String room) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.room = room;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getRoom() {
        return room;
    }
}
