package com.devlabs.Assignment3;

public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="abcde";
		char[] charArray = string.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]+" ");
		}
	}

}
