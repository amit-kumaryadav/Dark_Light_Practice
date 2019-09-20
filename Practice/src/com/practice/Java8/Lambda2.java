package com.practice.Java8;

public class Lambda2 {
	public static void main(String[] args) {
		Calc calc = (int x, int y) -> x * y;
		Calc calc1 = (int x, int y) -> x + y;
		System.out.println(calc.calculate(2, 3));
		System.out.println(calc1.calculate(2, 3));
	}
}

@FunctionalInterface
interface Calc {
	int calculate(int x, int y);
}
