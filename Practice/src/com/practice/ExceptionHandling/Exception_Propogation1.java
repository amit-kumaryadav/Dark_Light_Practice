package com.practice.ExceptionHandling;

public class Exception_Propogation1 {
	public static void main(String[] args) {
		System.out.println("In main method to start");
		try {
			m1();
		} catch (Exception e) {
			System.out.println("wert");
		}
		System.out.println("In main method to end");
	}

	static void m1() {
		System.out.println("In Inner Try");
		System.out.println(10 / 0);
		System.out.println("In Inner Try");
	}
}
