package org.example.module3.c02_enum_optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.WEDNESDAY;
        System.out.println(day.getDayType());
        day = DaysOfWeek.SATURDAY;
        System.out.println(day.getDayType());

        // set up repo
        PersonRepository repo = new PersonRepository();
        repo.add(new Person("1", "Max", DaysOfWeek.MONDAY));
        repo.add(new Person("2", "Maxi", DaysOfWeek.WEDNESDAY));
        repo.add(new Person("3", "Maxim", DaysOfWeek.FRIDAY));
        repo.add(new Person("4", "Maxima", DaysOfWeek.SUNDAY));

        Optional<Person> opPerson1 = repo.getPersonById("4");

        if (opPerson1.isPresent()){
            System.out.println(opPerson1.get());
        }

        opPerson1.ifPresent(System.out::println);
    }
}
