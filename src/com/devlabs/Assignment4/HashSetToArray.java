package com.devlabs.Assignment4;

import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {

		HashSet hashSet = new HashSet();
		hashSet.add("Uday");
		hashSet.add("Kumar");
		hashSet.add("Reddy");

		Object[] objArray = hashSet.toArray();

		System.out.println("Elements in Array :");
		for (int i = 0; i < objArray.length; i++) {
			System.out.println(objArray[i]);
		}
	}
}
