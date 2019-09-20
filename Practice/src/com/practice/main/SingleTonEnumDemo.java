package com.practice.main;

public class SingleTonEnumDemo {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.INSTANCE;
		Singleton obj2 = Singleton.INSTANCE;
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}

enum Singleton {
	INSTANCE;
	int value;

	public int getVaule() {
		return this.value;
	}

	public void setVaule(int value) {
		this.value = value;
	}
}