package com.practice.Thread;

public class Thread17_Synchronized extends Thread {
	Thread16_Synchronized a = new Thread16_Synchronized();

	@Override
	public void run() {
		a.count(20);
	}

	public static void main(String[] args) {
		Thread17_Synchronized th1 = new Thread17_Synchronized();
		th1.setName("Slave 1st");
		Thread17_Synchronized th2 = new Thread17_Synchronized();
		th2.setName("Slave 2nd");
		th1.start();
		th2.start();
	}

}
