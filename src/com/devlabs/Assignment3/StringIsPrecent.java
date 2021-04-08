package com.devlabs.Assignment3;

public class StringIsPrecent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String totalString="A brown fox ran away fast";
		boolean contains = totalString.contains("brown");
		if (contains) {
			System.out.println("brown is contains in total string :"+totalString);
		}else {
			System.out.println("brown is not in total string :"+totalString);
		}
	}
	

}
