package com.practice.Thread;

public class Thread7 extends Thread {
	@Override
	public void run() {
		System.out.println("Run Method:----->");
	}

	@Override
	public void start() {
		run();
		System.out.println("Start Method:----->");
		super.start();//custom thread will be created and run method will be executed two times
	}

	public static void main(String[] args) {
		Thread7 th1 = new Thread7();
		th1.start();
	}

}
