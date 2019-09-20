package com.practice.Thread;

public class Thread18_DeadLock {
	Integer int1 = 10;
	Integer int2 = 20;
	Thread th1 = new Thread(new Runnable() {
		@Override
		public void run() {
			while (true) {
				synchronized (int1) {
					synchronized (int2) {
						System.out.println(int1 + int2);
					}
				}
			}

		}
	});
	Thread th2 = new Thread(new Runnable() {
		@Override
		public void run() {
			while (true) {
				synchronized (int2) {
					synchronized (int1) {
						System.out.println(int1 + int2);
					}
				}
			}
		}
	});

	public static void main(String[] args) {
		Thread18_DeadLock deadLockThread = new Thread18_DeadLock();
		deadLockThread.th1.start();
		deadLockThread.th2.start();
	}
}
