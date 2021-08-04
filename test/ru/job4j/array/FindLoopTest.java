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

    @Test
    public void whenFind3() {
        int el = 3;
        int start = 1;
        int finish = 4;
        int[] data = new int[] {1, 2, 3, 4, 5};
        int expected = 2;
        int out = FindLoop.indexOf(data, el, start, finish);
        assertEquals(out, expected);
    }

    @Test
    public void whenNotFind5() {
        int el = 5;
        int start = 1;
        int finish = 3;
        int[] data = new int[] {1, 2, 3, 4, 5, 6};
        int expected = -1;
        int out = FindLoop.indexOf(data, el, start, finish);
        assertEquals(out, expected);
    }
}