package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int pointNull;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                pointNull = index;
                for (int cell = index + 1; cell < array.length; cell++) {
                    if (array[cell] != null) {
                        array = swap(array, pointNull, cell);
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static String[] swap(String[] array, int source, int dest) {
        String temp = array[dest];
        array[dest] = array[source];
        array[source] = temp;
        return array;
    }

    public static void main(String[] args) {
    }
 }
