package org.captiva.coding.mayra;

import org.captiva.coding.mayra.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void test01() {
        final int number = 1;
        assertEquals("1", FizzBuzz.solution(number));
    }

    @Test
    public void test02() {
        final int number = 3;

        assertEquals("Fizz", FizzBuzz.solution(number));
    }

    @Test
    public void test03() {
        final int number = 5;
        assertEquals("Buzz", FizzBuzz.solution(number));
    }

    @Test
    public void test04() {
        final int number = 15;

        assertEquals("FizzBuzz", FizzBuzz.solution(number));
    }

    @Test
    public void test05() {
        final int num = 20;

        assertEquals("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz\n" +
                "16\n" +
                "17\n" +
                "Fizz\n" +
                "19\n" +
                "Buzz", FizzBuzz.fizzBuzzSolution(num));
    }
}
