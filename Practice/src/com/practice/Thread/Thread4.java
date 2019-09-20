package com.practice.Thread;

public class Thread4 extends Thread {
	int x;

	Thread4() {
		this.x = 5;
	}

	Thread4(int x) {
		this.x = x;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.x; i++) {
			System.out.println(this.getName() + " " + i);
		}
	}

	public static void main(String args[]) {
		Thread4 obj1 = new Thread4();
		Thread4 obj2 = new Thread4(20);
		Thread4 obj3 = new Thread4(6);
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
