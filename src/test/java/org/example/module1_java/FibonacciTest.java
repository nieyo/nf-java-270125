package org.example.module1_java;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
    // methodName_givenCondition_expectedBehavior

    @Test
    void calculate_inputZero_returnZero() {
        //GIVEN
        int n = 0;
        int expected = 0;
        //WHEN
        int actual = Fibonacci.calculate(n);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void calculate_inputOne_returnOne() {
        //GIVEN
        int n = 1;
        int expected = 1;
        //WHEN
        int actual = Fibonacci.calculate(n);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void calculate_inputTwo_returnOne() {
        //GIVEN
        int n = 2;
        int expected = 1;
        //WHEN
        int actual = Fibonacci.calculate(n);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void calculate_inputFive_returnThree() {
        //GIVEN
        int n = 5;
        int expected = 3;
        //WHEN
        int actual = Fibonacci.calculate(n);
        //THEN
        assertEquals(expected, actual);
    }


}