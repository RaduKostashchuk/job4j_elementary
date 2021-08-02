package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when1ThenMon() {
        int in = 1;
        String expected = "Понедельник";
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(out, expected);
    }

    @Test
    public void when2ThenTue() {
        int in = 2;
        String expected = "Вторник";
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(out, expected);
    }

    @Test
    public void when3ThenWed() {
        int in = 3;
        String expected = "Среда";
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(out, expected);
    }

    @Test
    public void when4ThenThu() {
        int in = 4;
        String expected = "Четверг";
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(out, expected);
    }

    @Test
    public void when5ThenFri() {
        int in = 5;
        String expected = "Пятница";
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(out, expected);
    }

    @Test
    public void when6ThenSat() {
        int in = 6;
        String expected = "Суббота";
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(out, expected);
    }

    @Test
    public void when7ThenSun() {
        int in = 7;
        String expected = "Воскресенье";
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(out, expected);
    }

    @Test
    public void whenWrongThenErr() {
        int in = 8;
        String expected = "Ошибка";
        String out = SwitchWeek.nameOfDay(in);
        assertEquals(out, expected);
    }
}