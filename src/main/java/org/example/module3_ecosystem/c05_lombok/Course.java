package org.example.module3_ecosystem.c05_lombok;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    @NonNull
    String id;
    String name;
    Teacher teacher;
    List<Student> students;
}
