package org.captiva.coding.mayra;

import java.util.StringJoiner;

public final class FizzBuzz {
    private FizzBuzz() {

    }

    private static final int MULTIPLY_THREE = 3;
    private static final int MULTIPLY_FIVE = 5;

    public static String solution(final int a) {
        if (a % MULTIPLY_THREE == 0 && a % MULTIPLY_FIVE == 0) {
            return "FizzBuzz";
        }
        if (a % MULTIPLY_THREE == 0) {
            return "Fizz";
        }
        if (a % MULTIPLY_FIVE == 0) {
            return "Buzz";
        }
        return String.valueOf(a);
    }

    public static String fizzBuzzSolution(int num) {
        StringJoiner stringJoiner = new StringJoiner("\n");
        for (int i = 1; i <= num; i++) {
            stringJoiner.add(solution(i));
        }
        return stringJoiner.toString();
    }
}
