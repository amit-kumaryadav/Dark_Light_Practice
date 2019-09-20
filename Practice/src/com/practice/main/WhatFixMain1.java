package com.practice.main;

import java.util.HashMap;
import java.util.Map;

public class WhatFixMain1 {

	public static void main(String[] args) {
		int[] ticket = new int[] { 1, 1, 1, 1, 1, 1 };
		int no_Of_Ticket = 6;
		int cost = 0;
		int value = 0;
		int index = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < ticket.length; i++) {
			hm.put(i, ticket[i]);
		}
		System.out.println(hm);
		for (int i = 0; i < no_Of_Ticket; i++) {
			value = 0;
			index = -1;
			for (Map.Entry<Integer, Integer> hashMap : hm.entrySet()) {
				if (hashMap.getValue() > value) {
					value = hashMap.getValue();
					index = hashMap.getKey();
				}
			}
			System.out.println("cost " + hm.get(index));
			cost = cost + hm.get(index);
			hm.put(index, hm.get(index) - 1);
		}
		System.out.println(cost);
	}

}
