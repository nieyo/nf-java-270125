package org.example.module3_ecosystem.c02_enum_optional;

public record Person(
        String id,
        String name,
        DaysOfWeek favoriteDay
) {

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", favoriteDay=" + favoriteDay +
                '}';
    }
}
