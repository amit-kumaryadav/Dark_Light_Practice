package com.practice.main;

public class ArrangingZeroAndOne {

	public static void main(String[] args) {
		int ar[] = { 1, 1, 0, 1, 1 };
		int i = 0;
		int j = ar.length - 1;
		while (i < j) {
			if (ar[i] == 1) {
				ar[i] = ar[j] + ar[i];
				ar[j] = ar[i] - ar[j];
				ar[i] = ar[i] - ar[j];
				j = j - 1;
			} else {
				i = i + 1;
			}
		}
		for (i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
}
