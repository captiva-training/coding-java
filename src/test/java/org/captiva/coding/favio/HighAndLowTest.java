package org.captiva.coding.favio;

        import org.junit.Assert;
        import org.junit.Test;


public class HighAndLowTest {
    @Test
    public void highAndLow() throws Exception {


        Assert.assertEquals("42 -9", HighAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

}