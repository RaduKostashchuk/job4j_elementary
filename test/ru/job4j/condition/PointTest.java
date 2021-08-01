package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void whenX10Y10X22Y20Then1() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenX10Y13X20Y210Then7() {
        int x1 = 0;
        int y1 = 3;
        int x2 = 0;
        int y2 = 10;
        double expected = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenX13Y14X26Y28Then5() {
        int x1 = 3;
        int y1 = 4;
        int x2 = 6;
        int y2 = 8;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(out, expected, 0.01);
    }
}