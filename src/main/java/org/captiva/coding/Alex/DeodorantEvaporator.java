package org.captiva.coding.Alex;

public final class DeodorantEvaporator {

    private DeodorantEvaporator() {
    }

    public static int evaporator(double content, double evaporationPerDay, double threshold) {

        int contentDay = 0;
        final int percentage = 100;
        double limit = content * threshold / percentage;
        while (content > limit) {
            content = content - content * evaporationPerDay / percentage;
            contentDay++;
        }
        return contentDay;
    }
}

