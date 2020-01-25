package StringMethods;

import java.util.Arrays;
import java.util.Base64;
import java.util.Stack;

/*
Visit the JavaDocs for the String class to view everything you can do with a String.  


HINT:  Here are some String methods you might find useful 
contains
replace
trim
length
getBytes
endsWith
split 
indexOf
lastIndexOf
compareTo(IgnoreCase)
substring


Here are some Character methods you might find useful:
Character.toLowerCase(char c);
Character.isLetter(char c);
Character.isDigit(char c);
Character.getNumericValue(char c);
 */

public class StringMethods {

	// Given Strings s1 and s2, return the longer String
	public static String longerString(String s1, String s2) {
		String longerstring = "";
		
		if (s1.length() > s2.length()) {
			longerstring = s1;
		} else if (s1.length() == s2.length()) {
			longerstring = s1;
			//System.out.println("They are of equal lengths.");
		} else {
			longerstring = s2;
		}
		
		return longerstring;
	}

	
	// if String s contains the word "underscores", change all of the spaces to underscores
	public static String formatSpaces(String s) {
		if (s.contains("underscores")) {
			s = s.replace(' ', '_');		
		}
		
		return s;
	}

	
	// Return the name of the person whose LAST name would appear first if they were in alphabetical order
	// You cannot assume there are no extra spaces around the name, but you can
	// assume there is only one space between the first and last name
	public static String lineLeader(String s1, String s2, String s3) {
		String fal = "";
		Character c1 = '0';
		Character c2 = '0';
		Character c3 = '0';
		Character larger1 = ' ';
		Character larger2 = ' ';
		String larger11 = "";
		String larger12 = "";
//		int pos1 = -1;
//		int pos2 =  -1;
//		int pos3 = -1;
			
		s1 = s1.trim();
		s2 = s2.trim();
		s3 = s3.trim();
		
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				c1 = s1.charAt(i+1);
//				pos1 = i+1;
				break;
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) == ' ') {
				c2 = s2.charAt(i+1);
//				pos2 = i+1;
				break;
			}
		}
		for (int i = 0; i < s3.length(); i++) {
			if (s3.charAt(i) == ' ') {
				c3 = s3.charAt(i+1);
//				pos3 = i+1;
				break;
			}
		}
//		System.out.println(c1.compareTo(c2));
//		System.out.println(c1 + " " + c2);
		if (c1.compareTo(c2) < 0) {
			larger1 = c1;
			larger11 = s1;
		} else if (c1.compareTo(c2) == 0) {
			
		} else {
			larger1 = c2;
			larger11 = s2;
		}
			
		if (c1.compareTo(c3) < 0) {
			larger2 = c1;
			larger12 = s1;
			
		} else if (c1.compareTo(c3) == 0) {
			
		} else {
			larger2 = c3;
			larger12 = s3;
		}
		
		if (larger1.compareTo(larger2) < 0) {
			fal = larger11;
		} else {
			fal = larger12;
		}
		
		System.out.println(fal);
		return fal;
	}
	
	
	// Return the sum of all numerical digits in the String
	public static int numeralSum(String s) {
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				String temp = s.charAt(i) + "";
				int adding = Integer.parseInt(temp);
				sum = sum+adding;
			}
		}
		
		
		return sum;
	}
	
	
	// Return the number of times String substring appears in String s
	public static int substringCount(String s, String substring) {
		int numberoftimesrepeated = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (condition) {
				
			}
		}
		
		return numberoftimesrepeated;
	}

	// Call Utitilities.encrypt to encrypt String s
	public static String encrypt(String s, char key) {
		return Utilities.encrypt(s.getBytes(), (byte) key);
	}

	// Call Utilities.decrypt to decrypt the cyphertext
	public static String decrypt(String s, char key) {
		return Utilities.decrypt(s, (byte) key);
	}


	// Return the number of words in String s that end with String substring
	// You can assume there are no punctuation marks between words
	public static int wordsEndsWithSubstring(String s, String substring) {
		
		return 0;
	}
	

	// Given String s, return the number of characters between the first occurrence
	// of String substring and the final occurrence
	// You can assume that substring will appear at least twice
	public static int distance(String s, String substring) {
		return 0;
	}


	// Return true if String s is a palindrome
	// palindromes are words or phrases are read the same forward as backward.
	// HINT: ignore/remove all punctuation and spaces in the String
	public static boolean palindrome(String s) {
		s = s.trim();
		s = s.replace('.', ' ');
		s.re
		return true;
	}
	
}

class Utilities {
	// This basic encryption scheme is called single-byte xor. It takes a single
	// byte and uses exclusive-or on every character in the String.
	public static String encrypt(byte[] plaintext, byte key) {
		for (int i = 0; i < plaintext.length; i++) {
			plaintext[i] = (byte) (plaintext[i] ^ key);
		}
		return Base64.getEncoder().encodeToString(plaintext);
	}

	public static String decrypt(String cyphertext, byte key) {
		byte[] b = Base64.getDecoder().decode(cyphertext);
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) (b[i] ^ key);
		}
		return new String(b);
	}
}
