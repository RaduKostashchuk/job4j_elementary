package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {

        @Test
        public void whenSort() {
            int[] data = new int[] {3, 4, 1, 2, 5};
            int[] result = SortSelected.sort(data);
            int[] expected = new int[] {1, 2, 3, 4, 5};
            Assert.assertArrayEquals(expected, result);
        }

    @Test
    public void whenSort3() {
        int[] data = new int[] {100, 300, -10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-10, 100, 300};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {3, 4, 1, 1, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 1, 3, 4, 8};
        Assert.assertArrayEquals(expected, result);
    }
}