package com.devlabs.Assignment1;

public class Factorial {

//	1. Write a program to calculate the factorial of a number using a while loop.
//	The factorial of a positive number n is given by:
//	factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, fact = 1;
		int number = 10;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}
