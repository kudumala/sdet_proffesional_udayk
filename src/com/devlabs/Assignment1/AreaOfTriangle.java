package com.devlabs.Assignment1;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner baseObj = new Scanner(System.in);  
	    System.out.println("Enter base value :");

	    int base = baseObj.nextInt();
		
	    Scanner heightObj = new Scanner(System.in);  
	    System.out.println("Enter height value :");

	    int height = heightObj.nextInt();
	    
		double area= 0.5*(base*height);
		System.out.println("Area of the triangle is :"+ area );		

	
	}

}
