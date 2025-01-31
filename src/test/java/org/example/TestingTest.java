package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingTest {

    @Test
    void add_expectThree_whenAPlusBEqualsThree() {
        //given
        int a = 1;
        int b = 2;
        int expected = 3;
        //when
        int actual = Testing.add(a, b);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void isEven_expectFalse_whenNumberIsSeven() {
        int a = 7;
        boolean expected = false;
        boolean actual  = Testing.isEven(a);
        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        int a = 2;
        int b = 4;
        int expected = 8;
        int actual = Testing.multiply(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void toUpperCase() {
        String text = "Fische";
        String expected = "FISCHE";
        String actual = text.toUpperCase();
        assertEquals(expected, actual);
    }

    @Test
    void isPositive() {
        int a = 16;
        boolean expected = true;
        boolean actual = Testing.isPositive(a);
        assertEquals(expected, actual);
    }
}