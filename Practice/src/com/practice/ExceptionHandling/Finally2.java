package com.practice.ExceptionHandling;

public class Finally2 {
	public static void main(String[] args) {
		System.out.println(m1());

	}

	@SuppressWarnings("finally")
	static int m1() {
		try {
			System.out.println("In Outer Try");
			try {
				System.out.println("In Inner Try");
				System.out.println(10 / 0);
				return 0;
			} catch (ArithmeticException ex) {
				System.out.println("Catch");
				return 1;
			} finally {
				System.out.println("In Finally");
				//return 2;
			}
			// System.out.println("dsfdg");
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Outer  Finally");
		}
		System.out.println("After try/finally");
		return 5;
	}
}
