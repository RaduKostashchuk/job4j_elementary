package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int el = 5;
        int[] data = new int[] {5, 4, 7, 1};
        int expected = 0;
        int out = FindLoop.indexOf(data, el);
        assertEquals(out, expected);
    }

    @Test
    public void whenArrayDsntHaveThenm1() {
        int el = 8;
        int[] data = new int[] {5, 4, 7, 1};
        int expected = -1;
        int out = FindLoop.indexOf(data, el);
        assertEquals(out, expected);
    }
}