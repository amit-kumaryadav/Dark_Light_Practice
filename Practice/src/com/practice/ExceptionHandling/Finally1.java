package com.practice.ExceptionHandling;

public class Finally1 {

	public static void main(String[] args) {
		System.out.println(m1());

	}

	@SuppressWarnings("finally")
	static int m1() {
		try {
			try {
				System.out.println("In Try");
				System.out.println(10 / 0);
				return 0;
			} catch (NullPointerException ex) {
				System.out.println("Catch");
				return 1;
			} finally {
				System.out.println("In Finally");
				return 2;
			}
			//System.out.println("dsfdg");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Outer  Finally");
			return 3;
		}
	}

}
