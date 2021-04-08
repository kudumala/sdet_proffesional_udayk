package com.devlabs.Assignment1;

import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);  
	    System.out.println("Enter arraysize :");
	    int base = obj.nextInt();
	    int[] array = new int[base];
	    System.out.println("Enter values for array :"); 		
	    for (int i = 0; i < base; i++) {
			Scanner objArray = new Scanner(System.in);
			array[i]=objArray.nextInt();
		}
	    for (int i = array.length-1; i >=0; i--) {
			System.out.println(array[i]);
		}

	}

}
