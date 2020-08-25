package ru.bolgov.task1;

import java.util.StringJoiner;

public class AnagramMaker {
    public String makeAnagram(String text) {

        StringJoiner result = new StringJoiner(" ");
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            result.add(reverseWord(words[i]));
        }

        return result.toString();
    }

    private StringBuilder reverseWord(String inputWord) {
        StringBuilder result = new StringBuilder("");
        char[] letters = inputWord.toCharArray();
        for (int i = 0, j = letters.length - 1; i < letters.length; i++, j--) {
            if (i < j) {
                if (!Alphabet.checkLetter(letters[i])) {
                    j++;
                    result.append(letters[i]);
                    continue;
                } else if (!Alphabet.checkLetter(letters[j])) {
                    i--;
                    continue;
                } else {
                    char v = letters[i];
                    letters[i] = letters[j];
                    letters[j] = v;
                }
            }
            result.append(letters[i]);
        }
        return result;
    }

}
