package com.practice.Thread;

public class Thread16_Synchronized {
	public synchronized void count(int n) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + n + " Thread Name is: " + Thread.currentThread().getName());
		}
		synchronized (this) {
			
		}
	}
}
