package com.practice.main;

import java.util.ArrayList;

public class WhatFixMainChecker2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		addInList(al);
		System.out.println(al);
	}
	public static void addInList(ArrayList<Integer> al) {
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);
	}
}
