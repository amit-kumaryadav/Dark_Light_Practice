package com.practice.Thread;

public class Thread1 implements Runnable{

	public static void main(String[] args) {
		Thread1 obj1 = new Thread1();
		Thread th1 = new Thread(obj1, "Amit");
		th1.start();
	}

	@Override
	public void run() {
		System.out.println("Thread Name:"+ Thread.currentThread().getName() + " Thread Priority : "+Thread.currentThread().getPriority());
	}

}
