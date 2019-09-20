package com.practice.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main_Class_For_String_Check {

	public static void main(String[] args) {
		String s1 = "Amitmiit";
		HashMap<Character, Integer> map = new HashMap<>();
		char[] charArr = s1.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (map.getOrDefault(charArr[i], null) != null) {
				map.put(charArr[i], map.get(charArr[i]) + 1);
			} else {
				map.put(charArr[i], 1);
			}
		}
		ArrayList<No_Count_In_String_ascending_order> list = new ArrayList<>();
		for (Map.Entry<Character, Integer> count : map.entrySet()) {
			No_Count_In_String_ascending_order st = new No_Count_In_String_ascending_order();
			st.ch = count.getKey();
			st.count = count.getValue();
			list.add(st);
		}
		Collections.sort(list);
		list.forEach(p -> {
			System.out.println(" value is::::-> "+p.ch+"  "+p.count);
		});
	}
}
