package org.captiva.coding.alex;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpinWordTest {
    @Test
    public void test() {
        final SpinWord spinWord = new SpinWord();
        assertEquals("emocleW", spinWord.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", spinWord.spinWords("Hey fellow warriors"));
    }

}
