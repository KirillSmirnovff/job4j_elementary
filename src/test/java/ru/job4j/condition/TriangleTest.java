package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {
    @Test
    public void whenExistThenTrue() {
        double ab = 2;
        double ac = 3;
        double bc = 4;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExistThenFalse() {
        double ab = 4;
        double ac = 2;
        double bc = 2;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}
