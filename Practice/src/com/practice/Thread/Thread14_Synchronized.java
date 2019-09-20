package com.practice.Thread;

public class Thread14_Synchronized {
	int a, b;

	public synchronized void add(int a, int b) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int res = this.a + this.b;
		System.out.println("In " + Thread.currentThread().getName() + " Result: " + res);
	}
}
