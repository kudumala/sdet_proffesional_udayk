package com.devlabs.Assignment3;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String actual="trunk";
		int length = actual.length();
		char expected = 0;
		String expectedString = "";
		for (int i = length-1; i >=0; i--) {
			expected=actual.charAt(i);
			expectedString=expectedString+expected;
		}		
		if(actual.equalsIgnoreCase(expectedString)) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given String is not a Palindrome");
		}
	}

}
