package org.captiva.coding.Alex;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeodorantEvaporatorTest {

    @Test
    public void evaporator() {
        final int numberDay = 22;
        final int content = 10;
        final int evaporationPerDay = 10;
        final int threshold = 10;
        assertEquals(numberDay, DeodorantEvaporator.evaporator(content, evaporationPerDay, threshold));
    }
}
