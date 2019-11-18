package org.captiva.coding.favio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplementaryDnaTest {

    @Test
    public void test01() {
        assertEquals("TTTT", Complementarydna.makeComplement("AAAA"));
    }

    @Test
    public void test02() {
        assertEquals("TAACG", Complementarydna.makeComplement("ATTGC"));
    }

    @Test
    public void test03() {
        assertEquals("CATA", Complementarydna.makeComplement("GTAT"));
    }
}
