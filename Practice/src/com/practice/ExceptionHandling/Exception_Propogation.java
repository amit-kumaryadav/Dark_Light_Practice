package com.practice.ExceptionHandling;

public class Exception_Propogation {
	public static void main(String[] args) {
		System.out.println("In main method to start");
		System.out.println(m1());
		System.out.println("In main method to end");
	}

	@SuppressWarnings("finally")
	static int m1() {
		try {
			System.out.println("In Inner Try");
			System.out.println(10 / 0);
			return 0;
		} catch (NullPointerException ex) {
			System.out.println("Catch");
			return 1;
		} finally {
			System.out.println("In Finally");
		}
	}
}
