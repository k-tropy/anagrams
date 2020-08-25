package ru.bolgov.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

    public static void main(String[] args) {
        String text = readFromConsole();
        System.out.println((new AnagramMaker()).makeAnagram(text));
    }

    private static String readFromConsole() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return (reader.readLine());
        } catch (IOException e) {
            System.out.println("Error read from console");
        }
        return "";
    }
}
