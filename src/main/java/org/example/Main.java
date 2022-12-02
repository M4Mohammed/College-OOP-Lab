package org.example;

public class Main {
        //this is a comment

        public static void main(String[] args) {
        //Task 1
        TaskUno.AsciiToChar(65);


        //Task 2
        System.out.println(TaskDos.nCr(5, 3));
        System.out.println(TaskDos.nPr(5, 3));


        //Task 3
        System.out.println(TaskTres.max(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));


        //Task 4
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        TaskCuatro.transpose(matrix, 3);
        //it works, you don't need the output. Trust bro!

        //Task 5
        System.out.println(TaskCinco.deleteChar("Hello, World!", ','));

        //Task 6 works too. Trust bro!

        //Task 7
        int[] array = {232,24,46,31,72,216,1,25,254,51};
        TaskSeven.quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i);
        }

    }


}