package com.practice.Thread;

public class Thread10 extends Thread{

	static {
		System.out.println("In static block!");
		System.out.println("Priority of  thread!! --> " + Thread.currentThread().getPriority());
		System.out.println("Name of  thread!! --> " + Thread.currentThread().getName());

	}

	@Override
	public void run() {
		System.out.println("Inside Run ...");
		System.out.println("---> "+ currentThread().getName());
	}
	public static void main(String args[]) {
		Thread th = Thread.currentThread();
		th.setPriority(10);
		Thread10 th1 = new Thread10();
		th1.start();
		System.out.println("Original name and Priority of thread :---> "+ th.getName()+" "+th.getPriority());
		th.setName("Main Thread");
		System.out.println("Changed name and Changed Priority of thread :---> "+ th.getName()+" "+th.getPriority());
	}
}