package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenP22K10Then10() {
        double p = 22;
        double k = 10;
        double expected = 10;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }

    @Test
    public void whenP5K5Then086() {
        double p = 5;
        double k = 5;
        double expected = 0.86;
        double out = SqArea.square(p, k);
        Assert.assertEquals(out, expected, 0.01);
    }
}