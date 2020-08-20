package ru.bolgov.mentor.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainClass {

	public static void main(String[] args) {
		String text= new String(readConsole());
		System.out.println(makeAnagram(text));
	}
	
	public static String readConsole () {
				
		try (BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
			return (reader.readLine());
			}
		catch (IOException e) {
			System.out.println("Error read from console");
			}
		return "";
		
	}

	public static StringBuilder makeAnagram (String text) {
		StringBuilder returnedString = new StringBuilder("");
		String[] words=text.split(" ");
		
		for (int i=0; i<words.length;i++) {
			if (i!=0) {
				returnedString.append(" ");
			}
			returnedString.append(reversWord(words[i]));
		}
		
		return returnedString;
		
	}
	
	public static StringBuilder reversWord (String inputWord) {
		StringBuilder returnedWord = new StringBuilder("");
		char[] letters = inputWord.toCharArray();
		for (int i=0, j=letters.length-1; i<letters.length;i++,j--) {
			if(i<j) {
				if(!Alphabet.checkLetter(letters[i])) {
					j++;
					returnedWord.append(letters[i]);
					continue;
				} 
				else if(!Alphabet.checkLetter(letters[j])) {
					i--;
					continue;
				}
				else {
					char v=letters[i];
					letters[i]=letters[j];
					letters[j]=v;
				}
			}
			returnedWord.append(letters[i]);
		}
		return returnedWord;
	}
}
