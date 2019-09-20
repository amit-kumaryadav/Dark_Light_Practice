package com.practice.Thread;

public class Thread11 implements Runnable {
	Thread th;

	Thread11() {
		th = new Thread(this);
		th.setDaemon(true);
		th.start();
	}
// Daemon thread provide the service to main thread.
//In this case main method is main thread and custom is daemon thread
//If main thread completed then automatically daemon thread will be
//Terminated
	
	public static void main(String[] args) {
		Thread11 th1 = new Thread11();
		System.out.println("Main Count Down Start:");
		for (int i = 0; i <= 5; i++) {
			System.out.println("main: " + i);
		}
	}

	@Override
	public void run() {
		System.out.println("Run: " + th.isDaemon());
		for (int i = 0; i < 100; i++) {
			System.out.println("Run: " + i);
		}

	}

}
