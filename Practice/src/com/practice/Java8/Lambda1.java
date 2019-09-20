package com.practice.Java8;

public class Lambda1 {

	static void printFun(getFirst getFirst2) {
		getFirst2.test();
	}

	public static void main(String args[]) {
		printFun(() -> System.out.println("hi hellow!!!"));
		printFun(() -> {
			int i = 0;
			int y = 4;
			System.out.println(i + y);
		});
	}
}
@FunctionalInterface
interface getFirst {
	public void test();
	// public void test2();
}