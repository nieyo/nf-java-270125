package org.example.module2_object_orientation.c07_set_and_map;

import org.example.module2_object_orientation.c07_set_and_map.school.Course;
import org.example.module2_object_orientation.c07_set_and_map.school.School;
import org.example.module2_object_orientation.c07_set_and_map.school.Student;

import java.util.ArrayList;

public class Main_Challenge07 {

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

        // Medication

        Medication med1 = new Medication("Ibuprofen", 4.5f, true);
        Medication med2 = new Medication("Aspirin", 6.0f, true);
        Medication med3 = new Medication("Paracetamol", 5.7f, false);

        Pharmacy ph1 = new Pharmacy();
        ph1.save(med1);
        System.out.println(ph1.getCount());
        ph1.save(med2);
        System.out.println(ph1.getCount());
        ph1.save(med3);
        System.out.println(ph1.getCount());

        System.out.println(ph1.find("Aspirin"));
        ph1.delete("Aspirin");
        System.out.println(ph1.getCount());

        ph1.printMedications();








    }
}


