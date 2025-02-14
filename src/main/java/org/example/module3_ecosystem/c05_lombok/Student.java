package org.example.module3_ecosystem.c05_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    String id;
    String name;
    String address;
    float grade;
}
