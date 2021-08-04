package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = 3;
        int[] expected = {4, 2, 3, 1};
        int[] out = SwitchArray.swap(input, source, dest);
        assertArrayEquals(expected, out);
    }

    @Test
    public void whenSwap9To2() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 9;
        int dest = 2;
        int[] expected = {1, 2, 10, 4, 5, 6, 7, 8, 9, 3};
        int[] out = SwitchArray.swap(input, source, dest);
        assertArrayEquals(expected, out);
    }

    @Test
    public void whenSwap0To0() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = 0;
        int[] expected = {1, 2, 3, 4};
        int[] out = SwitchArray.swap(input, source, dest);
        assertArrayEquals(expected, out);
    }
}