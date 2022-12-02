package org.example;

public class TaskCuatro {
    public static void transpose(int[][] matrix, int N) {
        // N and M are the dimensions of the matrix (M x N)
        for(int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

}
