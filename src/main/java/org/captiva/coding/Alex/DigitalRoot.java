package org.captiva.coding.Alex;

public final class DigitalRoot {
    private DigitalRoot() {

    }

    public static int digitalRoot(int n) {
        String[] arrayDigits = String.valueOf(n).split("");
        int sum = 0;
        for (int i = 0; i < arrayDigits.length; i++) {
            sum += Integer.parseInt(arrayDigits[i]);
        }
        final int x = 9;
        if (sum > x) {
            return digitalRoot(sum);
        }
        return sum;
    }
}
