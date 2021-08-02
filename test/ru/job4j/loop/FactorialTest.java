package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int expected = 120;
        int out = Factorial.calc(in);
        assertEquals(out, expected);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int expected = 1;
        int out = Factorial.calc(in);
        assertEquals(out, expected);
    }

    @Test
    public void whenCalculateFactorialFor10Then3628800() {
        int in = 10;
        int expected = 3628800;
        int out = Factorial.calc(in);
        assertEquals(out, expected);
    }
}