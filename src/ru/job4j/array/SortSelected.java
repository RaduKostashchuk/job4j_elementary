package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
         for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int indexOfMin = FindLoop.indexOf(data, min, index, data.length - 1);
            data = swap(data, indexOfMin, index);
        }
        return data;
    }

    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[dest];
        array[dest] = array[source];
        array[source] = temp;
        return array;
    }
}
