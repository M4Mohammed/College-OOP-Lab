package org.example;

public class TaskSeven {
    public static int partition(int[] array, int lo, int hi) {
        int pivot = array[hi];
        int index = lo - 1;

        for (int i = lo; i < hi; i++) {
            if (array[i] <= pivot) {
                index++;
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[index + 1];
        array[index + 1] = array[hi];
        array[hi] = temp;

        return index + 1;
    }

    public static void quickSort(int[] array, int lo, int hi) {
        if (lo < hi) {
            int partitionIndex = partition(array, lo, hi);
            quickSort(array, lo, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, hi);
        }
    }
}
