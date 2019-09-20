package com.practice.main;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "GeeksForGeeks";
		int index = str.length() - 1;
		HashMap<Character, countClass> countStore = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (countStore.get(str.charAt(i)) != null) {
				countStore.get(str.charAt(i)).count++;
			} else {
				countClass count = new countClass();
				count.count++;
				count.index = i;
				countStore.put(str.charAt(i), count);
			}
		}
		for (Map.Entry<Character, countClass> count : countStore.entrySet()) {
			if (count.getValue().count == 1 && count.getValue().index < index) {
				index = count.getValue().index;
			}
		}
		System.out.println(str.charAt(index));
	}
}

class countClass {
	int count;
	int index;
}
