package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {

    @Test
    public void testAverageIntegers() {
        Sqrt s = new Sqrt(4);

        assertEquals(3.0, s.average(2, 4));
    }

    @Test
    public void testAverageDecimals() {
        Sqrt s = new Sqrt(4);

        assertEquals(2.75, s.average(2.5, 3.0));
    }

    @Test
    public void testAverageNegative() {
        Sqrt s = new Sqrt(4);

        assertEquals(-3.0, s.average(-2, -4));
    }

    @Test
    public void testGoodReturnsTrue() {
        Sqrt s = new Sqrt(9);

        assertTrue(s.good(3, 9));
    }

    @Test
    public void testGoodReturnsFalse() {
        Sqrt s = new Sqrt(9);

        assertFalse(s.good(2, 9));
    }

    @Test
    public void testImproveValue() {
        Sqrt s = new Sqrt(9);

        double improved = s.improve(1, 9);

        assertTrue(improved > 1);
    }

    @Test
    public void testImprovePerfectGuess() {
        Sqrt s = new Sqrt(4);

        assertEquals(2.0, s.improve(2, 4));
    }

    @Test
    public void testIterPerfectSquare() {
        Sqrt s = new Sqrt(16);

        double result = s.iter(1, 16);

        assertEquals(4.0, result, 0.0001);
    }

    @Test
    public void testIterNonPerfectSquare() {
        Sqrt s = new Sqrt(2);

        double result = s.iter(1, 2);

        assertEquals(Math.sqrt(2), result, 0.0001);
    }

    @Test
    public void testCalcFour() {
        Sqrt s = new Sqrt(4);

        assertEquals(2.0, s.calc(), 0.0001);
    }

    @Test
    public void testCalcNine() {
        Sqrt s = new Sqrt(9);

        assertEquals(3.0, s.calc(), 0.0001);
    }

    @Test
    public void testCalcTwo() {
        Sqrt s = new Sqrt(2);

        assertEquals(Math.sqrt(2), s.calc(), 0.0001);
    }

    @Test
    public void testCalcSmallFraction() {
        Sqrt s = new Sqrt(0.25);

        assertEquals(0.5, s.calc(), 0.0001);
    }

    @Test
    public void testCalcDecimal() {
        Sqrt s = new Sqrt(20.25);

        assertEquals(4.5, s.calc(), 0.0001);
    }

    @Test
    public void testLargeNumber() {
        Sqrt s = new Sqrt(1000000);

        assertEquals(1000.0, s.calc(), 0.001);
    }

    @Test
    public void testCompareWithMathSqrt() {
        double value = 12345.678;

        Sqrt s = new Sqrt(value);

        assertEquals(Math.sqrt(value), s.calc(), 0.0001);
    }

    @Test
    public void testSquareOfResult() {
        double value = 81;

        Sqrt s = new Sqrt(value);

        double result = s.calc();

        assertEquals(value, result * result, 0.0001);
    }

    @Test
    public void testCalcOne() {
        Sqrt s = new Sqrt(1);

        assertEquals(1.0, s.calc(), 0.0001);
    }

    @Test
    public void testAverageWithZero() {
        Sqrt s = new Sqrt(4);

        assertEquals(2.0, s.average(0, 4));
    }
}
