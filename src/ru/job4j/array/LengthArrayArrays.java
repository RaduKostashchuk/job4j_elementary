package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {1, 1}, {1, 1, 1}, {1, 1, 1, 1}};
        for (int element[] : numbers) {
            System.out.println("Размер вложенного массива равен: " + element.length);
        }
    }
}
