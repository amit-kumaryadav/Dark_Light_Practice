package com.practice.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String args[]) {
		int[] a = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		System.out.println(sockMerchant(9, a));
	}

	static int sockMerchant(int n, int[] ar) {
		List<Integer> al = new ArrayList<>();
		List<Integer> distinct = new ArrayList<>();
		for (int i = 0; i < ar.length; i++) {
			al.add(ar[i]);
		}
		distinct = al.stream().distinct().collect(Collectors.toList());
		int result = 0;
		int sum = 0;
		for (int i = 0; i < distinct.size(); i++) {
			sum = Collections.frequency(al, distinct.get(i));
			if (sum != 0)
				result = result + (sum / 2);
		}
		return result;
	}
}
