package com.hashTable;

import java.util.Map;
import java.util.TreeMap;

public class HashTableUC2 {

	static void count (String str) {
		Map<String,Integer> map = new TreeMap<>();

		String arr[] = str.split(" ");
		for (int i = 0;i<arr.length;i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[1],map.get(arr[i]) + 1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<String,Integer> entry:
			map.entrySet()) {
			System.out.println(entry.getKey() + " -> "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		String str ="Paranoids are not paranoid because "
				+ "they are paranoid but because they keep "
				+ "putting themselves deliberately into paranoid "
				+ "avoidable situations";
		count(str);
	}
}
