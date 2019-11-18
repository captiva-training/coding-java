package org.captiva.coding.mayra;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortTheInnerContentTest {
    @Test
    public void exampleTests() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
                SortTheInnerContent.sortTheInnerContent("sort the inner content in descending order"));
        assertEquals("wiat for me", SortTheInnerContent.sortTheInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", SortTheInnerContent.sortTheInnerContent("this kata is easy"));
    }
}
