package com.devlabs.Assignment1;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int i, num = 20, sum = 0;
		for (i = 1; i <= num; ++i) {
			sum = sum + i;
		}
		// prints the sum
		System.out.println("Sum of First 20 Natural Numbers is = " + sum);
	}
}