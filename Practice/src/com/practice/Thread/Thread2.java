package com.practice.Thread;

public class Thread2 extends Thread {
	public static void main(String[] args) {
		Thread2 obj1 = new Thread2();
		Thread2 obj2 = new Thread2();
		obj1.start();
		obj2.start();
	}

	@Override
	public void run() {
		try {
			System.out.println("Thread Name:" + Thread.currentThread().getName() + " Thread Priority : "
					+ Thread.currentThread().getPriority());
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
