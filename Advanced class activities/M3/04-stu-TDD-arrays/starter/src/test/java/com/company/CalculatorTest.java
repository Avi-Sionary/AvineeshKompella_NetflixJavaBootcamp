package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldDividePositives() {

        assertEquals(3, calc.divide(6,2));
        assertEquals(2, calc.divide(80, 39));
        assertEquals(1, calc.divide(105, 100));
    }

    @Test
    public void shouldDivideNegatives() {

        assertEquals(3, calc.divide(-6,-2));
        assertEquals(2, calc.divide(-80, -39));
        assertEquals(1, calc.divide(-105, -100));
    }

    @Test
    public void shouldDivideBothPosAndNeg() {
        assertEquals(-3, calc.divide(6,-2));
        assertEquals(-2, calc.divide(-80, 39));
        assertEquals(-1, calc.divide(105, -100));
    }

    @Test
    public void shouldReturnZero() {
        assertEquals(0, calc.divide(0,0));
        assertEquals(0, calc.divide(0, 1));
        assertEquals(0, calc.divide(105, 0));
    }

    @Test
    public void shouldSumArrays() {
        int[] testArr1 = {1,2,3,4};
        int[] testArr2 = {5,6,7,8};
        assertEquals(36, calc.sumArrays(testArr1, testArr2));

        int[] testArr3 = {9,10,11,12};
        //assertEquals(21, calc.sumArrays(testArr1, testArr3));
    }

    @Test
    public void shouldArrayify() {
        int[] testArr1 = {5, 6, 7};
        assertArrayEquals(testArr1, calc.arrayify(3, 5));

        int[] testArr2 = {100, 101, 102};
        assertArrayEquals(testArr2, calc.arrayify(3, 100));
        //assertArrayEquals(testArr2, calc.arrayify(3, 99));
        //assertArrayEquals(testArr2, calc.arrayify(4, 100));
    }

}
