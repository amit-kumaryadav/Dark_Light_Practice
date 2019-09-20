package com.practice.main;

public class StringA {

	public static void main(String[] args) {
		String A = "ABC";
		StringB b = new StringB();
		if (A == b.B) {
			// here both string taking the same reference
			System.out.println("One String constant pool area per jvm");
		}

	}

}
