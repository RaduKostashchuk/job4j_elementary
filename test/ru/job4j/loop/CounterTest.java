package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int out = Counter.sumByEven(start, finish);
        assertEquals(out, expected);
    }

    @Test
    public void whenSumEvenNumbersFrom20To30Then150() {
        int start = 20;
        int finish = 30;
        int expected = 150;
        int out = Counter.sumByEven(start, finish);
        assertEquals(out, expected);

    }

    @Test
    public void whenSumEvenNumbersFromm20Tom30Thenm150() {
        int start = -30;
        int finish = -20;
        int expected = -150;
        int out = Counter.sumByEven(start, finish);
        assertEquals(out, expected);

    }
}