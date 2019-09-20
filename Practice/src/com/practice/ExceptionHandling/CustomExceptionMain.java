package com.practice.ExceptionHandling;

public class CustomExceptionMain {
	public static void main(String[] args) {
		try {
			throw new MyException("Exception Occured!!!");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
