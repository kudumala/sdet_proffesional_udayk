package com.devlabs.Assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAlphabet {

	public static void main(String[] args) {
		ArrayList<String> arrayli = new ArrayList<String>();
		arrayli.add("Uday");
		arrayli.add("Kumar");
		arrayli.add("Reddy");
		arrayli.add("BR");		
		System.out.println("Initial Order:");
		printElements(arrayli);
		Collections.sort(arrayli);
		System.out.println("Alphabet Order:");
		printElements(arrayli);		
	}
	public static void printElements(ArrayList<String> alist) {
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i) + " ");
		}
	}
}
