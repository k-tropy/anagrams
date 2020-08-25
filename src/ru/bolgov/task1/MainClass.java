package ru.bolgov.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

    public static void main(String[] args) throws IOException {
        String text = readFromConsole();
        System.out.println((new AnagramMaker()).makeAnagram(text));
    }

    private static String readFromConsole() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return (reader.readLine());
    }
}
