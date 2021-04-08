package com.devlabs.Assignment4;

import java.util.HashMap;

public class HashMapKeyExists {

	public static void main(String[] args) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(10, "Uday");
		hash_map.put(15, "Kumar");
		hash_map.put(20, "Reddy");
		hash_map.put(25, "Kudumala");
		hash_map.put(30, "BR");

		System.out.println("Initial Hash Mappings are: " + hash_map);

		System.out.println("Is Hash key '20' present? " + hash_map.containsKey(20));
		System.out.println("Is Hash key '5' present? " + hash_map.containsKey(5));
	}

}
