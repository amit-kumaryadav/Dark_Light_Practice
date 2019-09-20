package com.practice.Thread;

public class Thread13_JoinMethod extends Thread {

	public static int count;

	public static synchronized void increaseCount() {
		count++;
	}

	public static void main(String[] args) throws InterruptedException {
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increaseCount();
				}
			}
		});
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increaseCount();
				}
			}
		});
		th1.start();
		th1.join();
		th2.start();
		th2.join();
		System.out.println(count);
	}
}
