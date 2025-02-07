package org.example.module2_object_orientation.c06_list;

import java.util.ArrayList;

public class Main_Challenge06 {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Marty", "McFly", "0001" ));
        students.add(new Student("Emmet", "Brown", "0002" ));

        Student student3 = new Student("Biff", "Tannen", "0003" );
        Student student4 = new Student("Jessica", "Parker", "0004" );

        School mySchool = new School();
        mySchool.addStudent(student3);
        mySchool.addStudent(student4);
        mySchool.addClassOfStudents(students);
        System.out.println(mySchool.toString());

        Student foundStudent = mySchool.findStudentByID("0003");
        System.out.println(foundStudent.toString());

        // mySchool.deleteStudent(foundStudent);
        System.out.println(mySchool.toString());

        Course course1 = new Course("Time Travel for Beginners", "Emmett Brown", "Doc's Laboratory");
        Course course2 = new Course("How to stay out of other peoples shit", "George McFly", "2");
        Course course3 = new Course("Skating 101", "Marty McFly", "Park");
        mySchool.findStudentByID("0001").addStudentToCourse(course1);
        mySchool.findStudentByID("0004").addStudentToCourse(course1);
        mySchool.findStudentByID("0001").addStudentToCourse(course2);
        mySchool.findStudentByID("0003").addStudentToCourse(course2);
        mySchool.findStudentByID("0004").addStudentToCourse(course3);
        mySchool.findStudentByID("0002").addStudentToCourse(course3);

        mySchool.printCoursesOfStudentByID("0001");
        mySchool.printCoursesOfStudentByID("0002");
        mySchool.printCoursesOfStudentByID("0003");
        mySchool.printCoursesOfStudentByID("0004");
    }
}


