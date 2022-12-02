package org.example;

public class TaskDos {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int nPr(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static int nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

}
