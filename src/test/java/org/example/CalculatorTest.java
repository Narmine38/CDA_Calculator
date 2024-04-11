package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test void testSubtraction() {
        assertEquals(0, calculator.subtract(2, 2));
    }

    @Test void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
    }
    @Test void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
    }
}