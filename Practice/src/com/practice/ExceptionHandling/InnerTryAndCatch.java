package com.practice.ExceptionHandling;

public class InnerTryAndCatch {
	public static void main(String[] args) {
		try {
			try {
				System.out.println(10/0);
			}catch(IndexOutOfBoundsException ex) {
				System.out.println("Inside Inner");
			}
		}catch(Exception ex) {
			System.out.println("Inside outer");
		}
	}
}
