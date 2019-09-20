package com.practice.Thread;

public class Thread9 extends Thread {
	public void oneto50() {
		for (int i = 0; i < 50; i++) {
			System.out.print(i + " ");
		}
	}

	public void fiftyto1() {
		for (int i = 0; i < 50; i++) {
			System.out.print(i + " ");
		}
	}

	@Override
	public void run() {
		oneto50();
	}

	public static void main(String args[]) {
		long time1 = System.currentTimeMillis();
		Thread9 thread9 = new Thread9();
		thread9.start();
		System.out.println("");
		thread9.fiftyto1();
		System.out.println();
		long time2 = System.currentTimeMillis();
		System.out.println((time2 - time1) + " Seconds");
	}
}
