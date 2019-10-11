package org.captiva.coding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighAndLowTest {

    @Test
    public void highAndLow() {
        assertEquals("42 -9", HighAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
