package com.practice.Thread;

public class Thread15_Synchronized {
	public static void main(String[] args) {
		Thread14_Synchronized th14 = new Thread14_Synchronized();
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				th14.add(10, 20);
			}
		});
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				th14.add(12, 12);
			}
		});
		th1.start();
		th2.start();
	}
}
