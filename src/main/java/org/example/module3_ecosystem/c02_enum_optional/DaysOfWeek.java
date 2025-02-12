package org.example.module3_ecosystem.c02_enum_optional;

public enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String friendlyName;

    DaysOfWeek(String friendlyName){
        this.friendlyName = friendlyName;
    }

    // ordinal() returns position of declaration in the enum, starting from zero
    public String getDayType() {
        return this.ordinal() <= 4 ? this.friendlyName : "Weekend";
    }
}
