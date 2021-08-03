package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int in = 3;
        int[] expected = new int[] {0, 1, 4};
        int[] out = Square.calculate(in);
        assertArrayEquals(out, expected);
    }

    @Test
    public void whenBound5Then014916() {
        int in = 5;
        int[] expected = new int[] {0, 1, 4, 9, 16};
        int[] out = Square.calculate(in);
        assertArrayEquals(out, expected);
    }
}