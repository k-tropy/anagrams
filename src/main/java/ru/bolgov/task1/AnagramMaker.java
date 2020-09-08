package ru.bolgov.task1;

import java.util.StringJoiner;

public class AnagramMaker {
    public String makeAnagram(String text) {
        if (null == text) {
            throw new RuntimeException("input expected to not be null");
        }

        StringJoiner result = new StringJoiner(" ");
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            result.add(reverseWord(words[i]));
        }

        return result.toString();
    }

    private String reverseWord(String inputWord) {
        StringBuilder result = new StringBuilder("");
        char[] letters = inputWord.toCharArray();
        for (int i = 0, j = letters.length - 1; i < letters.length; i++, j--) {
            if (i < j) {
                if (!isLetter(letters[i]) || !isLetter(letters[j])) {
                    if (!isLetter(letters[j])) {
                        i--;
                    } else {
                        j++;
                        result.append(letters[i]);
                    }
                    continue;
                } else {
                    swapLetters(letters, i, j);
                }
            }
            result.append(letters[i]);
        }
        return result.toString();
    }

    private void swapLetters(char[] letters, int i, int j) {

        char v = letters[i];
        letters[i] = letters[j];
        letters[j] = v;
    }

    private boolean isLetter(char letter) {
        return (letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z');
    }

}
