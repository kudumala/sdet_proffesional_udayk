package com.devlabs.Assignment3;

public class ExceptionArith {

	public static void main(String[] args) {
		
		int calc = calc(10,0);
		System.out.println(calc);
	}

	public static int calc(int x,int y) {
		int z = 0;
		try {
			z=x/y;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}		
		return z;
	}
}
