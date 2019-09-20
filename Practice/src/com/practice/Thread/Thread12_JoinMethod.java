package com.practice.Thread;

public class Thread12_JoinMethod extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(this.getName() + " " + i);
			if (this.getName().equals("Child1")) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main is started!!");
		Thread12_JoinMethod th1 = new Thread12_JoinMethod();
		th1.setName("Child1");
		th1.start();
		th1.join();
		Thread12_JoinMethod th2 = new Thread12_JoinMethod();
		Thread12_JoinMethod th3 = new Thread12_JoinMethod();
		th2.setName("Child2");
		th2.start();
		// Start th2 after finishing th1
		th2.join();
		th3.setName("Child3");
		th3.start();
		// Start th3 after finishing th2
		th3.join();
	}
}
