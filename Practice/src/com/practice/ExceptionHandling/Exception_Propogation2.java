package com.practice.ExceptionHandling;

public class Exception_Propogation2 {
	public static void main(String[] args) {
		System.out.println("In main method to start");
		try {
			m2();
		} catch (NullPointerException e) {
			System.out.println("wert");
		}
		System.out.println("In main method to end");
	}

	static int m2() {
		int a;
		try {
			a = 10;
			System.out.println(a / 0);
			return a;
		} catch (NullPointerException px) {
			a = 20;
			System.out.println(a);
			return a;
		}
	}
}
