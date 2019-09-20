package com.practice.main;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main_Method_For_TreeMap {

	public static void main(String[] args) {
		String s1 = "abbbccc";
		char[] charArr = s1.toCharArray();
		No_Count_Using_TreeMap countMap = null;
		TreeMap<No_Count_Using_TreeMap, Integer> map = new TreeMap<>(new Comparator<No_Count_Using_TreeMap>() {
			@Override
			public int compare(No_Count_Using_TreeMap obj1, No_Count_Using_TreeMap obj2) {
				int count = obj1.ch - obj2.ch;
				if (obj1.count > obj2.count) {
					return -1;
				}
				if (obj1.count < obj2.count) {
					return 1;
				}
				if (count > 0) {
					return -1;
				}
				if (count < 0)
					return 1;
				return 0;
			}
		});
		for (int i = 0; i < charArr.length; i++) {
			countMap = new No_Count_Using_TreeMap();
			countMap.ch = charArr[i];
			countMap.count = 1;
			if (map.get(countMap) != null) {
				map.put(countMap, map.get(countMap) + 1);
			} else {
				map.put(countMap, 1);
			}
		}
		for (Map.Entry<No_Count_Using_TreeMap, Integer> count : map.entrySet()) {
			System.out.println("  Character:::->" + count.getKey().ch + " Count::->" + count.getKey().count
					+ "   Real Count::->" + count.getValue());
		}
	}

}
