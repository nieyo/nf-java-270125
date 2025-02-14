package org.example.module3_ecosystem.c03_streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        // generate list of numbers 1 to 10
        List<Integer> numberList = generateNumberList(10, 1);

        // output even numbers
        numberList.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

        // double the numbers
        numberList.stream()
                .map(number -> number * 2)
                .forEach(System.out::println);
        List<Integer> doubledNumbers = numberList.stream()
                .map(number -> number * 2)
                .toList();

        // sort ascending, sorted() sortiert default by value
        // numberList.stream().sorted(Comparator.comparingInt(Integer::intValue)).forEach(System.out::println);
        numberList.stream()
                .sorted()
                .forEach(System.out::println);

        // sum, 0 is initial value
        System.out.println(numberList.stream()
                .reduce(0, Integer::sum));

        // BONUS

        List<Student> students = Files.lines(Path.of("students.csv"))
                .skip(1)
                .map(line -> line.split(","))
                .filter(parts -> parts.length == 4)
                .map(parts -> new Student(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        parts[2],
                        Integer.parseInt(parts[3]))
                )
                .toList();

        System.out.println(students);

    }

    public static List<Integer> generateNumberList(int size, int startValue) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(startValue + i);
        }
        return numbers;
    }
}
