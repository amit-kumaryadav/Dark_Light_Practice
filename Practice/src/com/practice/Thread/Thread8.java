package com.practice.Thread;

public class Thread8 {

	public void oneto50() {
		for(int i =0; i< 50; i++) {
			System.out.print(i+" ");
		}
	}
	public void fiftyto1() {
		for(int i =0; i< 50; i++) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		Thread8 thread8 = new Thread8();
		thread8.oneto50();
		System.out.println("");
		thread8.fiftyto1();
		System.out.println("");
		long time2 = System.currentTimeMillis();
		System.out.println((time2 -time1)+" Seconds");
	}

}
