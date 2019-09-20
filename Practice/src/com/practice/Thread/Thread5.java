package com.practice.Thread;

public class Thread5 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String args[]) {
		Thread5 ob1 = new Thread5();
		Thread5_1 ob2 = new Thread5_1();
		Thread5_2 ob3 = new Thread5_2();
		ob1.start();
		ob2.start();
		ob3.start();
	}
}

class Thread5_1 extends Thread5 {

}

class Thread5_2 extends Thread5 {

}