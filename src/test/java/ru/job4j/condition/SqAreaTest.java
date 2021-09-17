package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2thenSquare2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K2thenSquare0Dot889() {
        double expected = 0.889;
        double p = 4;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K3thenSquare4Dot687() {
        double expected = 4.687;
        double p = 10;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}