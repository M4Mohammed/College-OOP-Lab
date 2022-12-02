package org.example;

import static org.example.TaskDos.factorial;

public class TaskTres {

    public static int max(int[] array) throws IllegalArgumentException {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
