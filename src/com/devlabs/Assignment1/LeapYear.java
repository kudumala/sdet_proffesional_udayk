package com.devlabs.Assignment1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner yearObj = new Scanner(System.in);  
	    System.out.println("Enter year value :");
	    int year = yearObj.nextInt();
	    if (year%4==0) {
			System.out.println("Entered year value is a Leap Year");
		}else {
			System.out.println("Entered year value is not a Leap Year");
		}
	}

}
