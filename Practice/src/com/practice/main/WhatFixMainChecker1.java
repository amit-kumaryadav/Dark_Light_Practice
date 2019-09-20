package com.practice.main;

public class WhatFixMainChecker1 {
	public static void main(String[] args) {
		A_W1 a1 = new A_W1(1);
		A_W1 a2 = new A_W1(2);
		swap(a1, a2);
		System.out.println(a1.val);
		System.out.println(a2.val);
	}
	static void swap(A_W1 a1, A_W1 a2){
		a1 = null;
		a2 = null;
		A_W1 temp;
		temp = a1;
		a1 = a2 ;
		a2 = temp;
		System.out.println(a1.val);
		System.out.println(a2.val);
		a1.val = 5;
	}
}

class A_W1 {
	int val = 0;

	A_W1(int val) {
		this.val = val;
	}
}
