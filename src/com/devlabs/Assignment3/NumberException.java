package com.devlabs.Assignment3;

public class NumberException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int output=Integer.parseInt("1");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
