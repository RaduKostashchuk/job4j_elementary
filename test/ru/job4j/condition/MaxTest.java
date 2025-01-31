package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then1() {
        int left = 2;
        int right = 1;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenEqu2To2Then1() {
        int left = 2;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(result, expected);
    }
}