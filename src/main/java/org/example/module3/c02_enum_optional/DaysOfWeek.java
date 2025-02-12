package org.example.module3.c02_enum_optional;

public enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public String getDayType() {
        return this.ordinal() <= 4 ? this.name() : "WEEKEND";
    }
}
