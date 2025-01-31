package org.example;

public class Testing {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
    }
    public static int add(int a, int b){
        return a + b;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static boolean isPositive(int a) {
        return a > 0;
    }
}
