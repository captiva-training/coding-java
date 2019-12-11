package org.captiva.coding.Alex;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalRootTest {
    @Test
    public void tests() {
        final int input1 = 16;
        final int output1 = 7;
        final int input2 = 456;
        final int output2 = 6;
        final int input3 = 493193;
        final int output3 = 2;
        assertEquals("Nope!", output1, DigitalRoot.digitalRoot(input1));
        assertEquals("Nope!", output2, DigitalRoot.digitalRoot(input2));
        assertEquals("Nope!", output3, DigitalRoot.digitalRoot(input3));
    }
}

