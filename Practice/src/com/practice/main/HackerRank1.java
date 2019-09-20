package com.practice.main;

import java.util.HashMap;

public class HackerRank1 {

	public static void main(String[] args) {
	int [] q = new int[] {2, 5, 1, 3, 4};
	minimumBribes(q);
	}

	static void minimumBribes(int[] q) {
		int temp = 0;
		int count = 0;
		HashMap<Integer, Integer> noChecker = new HashMap<>();
		HashMap<Integer, Integer> inputChecker = new HashMap<>();
		int[] originalBase = new int[q.length];
		for (int i = 1; i <= q.length; i++) {
			originalBase[i - 1] = i;
			inputChecker.put(i, q[i - 1]);
		}
		for (int i = 0; i < q.length; i++) {
			if (q[i] != originalBase[i]) {
				temp = q[i];
				int k = inputChecker.get(temp);
				q[i] = originalBase[i];
				q[temp - 1] = temp;
				boolean flag1 = noCheckers(temp, noChecker);
				boolean flag2 = noCheckers(q[i], noChecker);
				if (flag1 && flag2) {
					count++;
				} else {
					System.out.println("Too chaotic");
					return;
				}
			}
		}
		System.out.println(count);
	}

	public static boolean noCheckers(int temp, HashMap<Integer, Integer> noChecker) {
		if (noChecker.get(temp) == null) {
			noChecker.put(temp, 1);
		} else {
			if (noChecker.get(temp) >= 2) {
				return false;
			} else {
				noChecker.put(temp, noChecker.get(temp) + 1);
			}
		}
		return true;
	}
}
