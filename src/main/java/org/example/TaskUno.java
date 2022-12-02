package org.example;

public class TaskUno {

    public static void AsciiToChar(int ascii) throws IllegalArgumentException{
        if (ascii < 0 || ascii > 255) {
            throw new IllegalArgumentException("The value must be between 0 and 255");
        }
        System.out.println((char) ascii);
    }
}
