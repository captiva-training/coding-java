package org.captiva.coding.favio;

public final class HighAndLow {
    private HighAndLow() {
    }

    public static String highAndLow(final String numbers) {
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        String[] arrayNumbers = numbers.split(" ");
        for (String arrayNumber : arrayNumbers) {
            int number = Integer.parseInt(arrayNumber);
            if (number > high) {
                high = number;
            }
            if (number < low) {
                low = number;

            }
        }
        return high + " " + low;
    }
}
