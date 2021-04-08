package com.devlabs.Assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapToList {

	public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Uday");
        map.put(2, "Kumar");
        map.put(3, "Reddy");
        map.put(4, "BR");
        map.put(5, "Kudumala");

        List<Integer> keyList = new ArrayList(map.keySet());
        List<String> valueList = new ArrayList(map.values());

        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);	}

}
