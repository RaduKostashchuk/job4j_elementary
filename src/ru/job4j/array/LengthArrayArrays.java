package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {1, 1}, {1, 1, 1}, {1, 1, 1, 1}};
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Размер вложенного массива равен: " + numbers[index].length);
        }
    }
}
