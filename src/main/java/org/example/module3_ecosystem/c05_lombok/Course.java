package org.example.module3_ecosystem.c05_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    String id;
    String name;
    Teacher teacher;
    List<Student> students;
}
