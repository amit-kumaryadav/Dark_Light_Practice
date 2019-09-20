package com.practice.Thread;

public class Thread3 extends Thread {
	@Override
	public void run() {
		System.out.println("Current Thread Name: " + Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		Thread3 obj1 = new Thread3();
		obj1.start();
		obj1.run();
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
		}
	}
}
