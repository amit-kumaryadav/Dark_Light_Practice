package com.practice.Thread;

public class Thread6 {
	public void  start() {
		System.out.println("start");
	}
	public static void main(String args[]) {
		Thread obj1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("fdx");
			}
		});
		obj1.start();
		Thread obj2 = new Thread(() -> {
			System.out.println("sdfg");
		});
		obj2.start();
	}
}
