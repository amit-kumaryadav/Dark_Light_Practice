package com.practice.main;

public class MultiplicationOfNoWithoutUsingCollection {
	public static void main(String args[]) {
		int no = 32002;
		int noMultiplication = 1;
		int count = 0;
		while (no != 0) {
			if (no % 10 == 0) {
				count++;
				no = no / 10;
			} else {
				noMultiplication = noMultiplication * (no % 10)*(int)Math.pow(10, count);
				no = no / 10;
			}
		}
		System.out.println(noMultiplication);
	}
}
