package org.example;

public class TaskCinco {
    //delete char from given string using regex
    public static String deleteChar(String str, char ch) {
        return str.replaceAll(String.valueOf(ch), "");
    }

}
