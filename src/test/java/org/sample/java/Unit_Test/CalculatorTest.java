package org.sample.java.Unit_Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {

        int expected = 4;

        int actual;
        actual = new Calculator().add(2, 2);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        int expected = 38;

        int actual;
        actual = new Calculator().add(5,32,1);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        int expected = 6;

        int actual;
        actual = new Calculator().subtract(10, 4);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        int expected = 40;

        int actual;
        actual = new Calculator().multiply(10, 4);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        int expected = 2;

        int actual;
        actual = new Calculator().divide(10, 4);

        assertEquals(expected, actual);
    }


}