package ru.job4j.loop;

public class Mortage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = amount + amount * percent / 100 - salary;
            year++;
        }
        return year;
    }
}
