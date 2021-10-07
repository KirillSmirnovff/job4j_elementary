package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to31then2() {
        double expected = 2;
        Point first = new Point(3, 3);
        Point second = new Point(3, 1);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus21to31then5() {
        double expected = 5;
        Point first = new Point(-2, 1);
        Point second = new Point(3, 1);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to45then2() {
        double expected = 5;
        Point first = new Point(1, 1);
        Point second = new Point(4, 5);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}