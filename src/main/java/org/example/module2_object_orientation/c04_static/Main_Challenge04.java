package org.example.module2_object_orientation.c04_static;

public class Main_Challenge04 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        Counter.incrementTotalCount();
        c1.incrementInstanceCount();

        System.out.println(c1.toString());
        System.out.println(c2.toString());


        // Bonus
        System.out.println("\n\n----- Calculator -----");
        System.out.println(Calculator.add(3,5));
        System.out.println(Calculator.subtract(3,5));
        System.out.println(Calculator.multiply(3,5));
        System.out.println(Calculator.divide(3,5));
        System.out.println("----------------------");


    }
}
