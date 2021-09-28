package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort5() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {8, 4, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 7, 8};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort8() {
        int[] data = new int[] {8, 4, 7, 1, 4, 2, 9, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 2, 4, 4, 7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }
}