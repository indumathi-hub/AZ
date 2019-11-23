package org.pack;

import java.util.HashMap;

public class Indu {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap();
		String s1 = "thangaraj";
		char[] array = s1.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				//map.put(array[i], map.get(array[i]) + 1);
          System.out.println(array[i]);
          break;
			} else {
				map.put(array[i], 1);
			}
		}

	}
}
