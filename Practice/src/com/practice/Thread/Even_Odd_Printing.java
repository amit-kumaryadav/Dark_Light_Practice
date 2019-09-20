package com.practice.Thread;

public class Even_Odd_Printing {
	public boolean checkOdd;
	public int count = 1;
	int max = 40;

	public void printOdd() {
		synchronized (this) {
			while (max > count) {
				while (checkOdd) {
					// System.out.println("Waiting For Lock:::: Odd_Block " + count);
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// System.out.println("After Notifying:::: Odd_Block " + count);
				}
				System.out.println("Odd ::: " + count);
				count++;
				checkOdd = true;
				notify();
			}
		}
	}

	public void printEven() {
		synchronized (this) {
			while (max > count) {
				while (!checkOdd) {
					// System.out.println("Waiting For Lock:::: Even_Block " + count);
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					// System.out.println("After Notifying:::: Even_Block " + count);
				}
				System.out.println("Even :::: " + count);
				count++;
				checkOdd = false;
				notify();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Even_Odd_Printing printOddEven = new Even_Odd_Printing();
		printOddEven.checkOdd = true;
		Thread th1 = new Thread(new Runnable() {
			@Override
			public void run() {
				printOddEven.printEven();
			}
		});
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				printOddEven.printOdd();
			}
		});
		th1.start();
		th2.start();
		th1.join();
		th2.join();
	}
}
