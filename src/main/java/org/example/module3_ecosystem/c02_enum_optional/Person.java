package org.example.module3_ecosystem.c02_enum_optional;

public record Person(
        String id,
        String name,
        DaysOfWeek favoriteDay
) {

    @Override
    public String toString() {
        return "Perso{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", favoriteDay=" + favoriteDay +
                '}';
    }
}
