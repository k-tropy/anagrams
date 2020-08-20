package ru.bolgov.mentor.task1;

public class Alphabet {
	static char[] alphabet=(new String("qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM")).toCharArray();
	
	public static boolean checkLetter(char letter) {
		
		for(int i=0; i<alphabet.length;i++) {
			if(letter==alphabet[i]) {
				return true;
			}
		}
		return false;
	}

}
