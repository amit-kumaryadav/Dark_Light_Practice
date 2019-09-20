package com.practice.ExceptionHandling;

public class Finally {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("In Finally Block");
		}
	}

}
