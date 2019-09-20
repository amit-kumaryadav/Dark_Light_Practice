package com.practice.main;

public class No_Count_In_String_ascending_order implements Comparable<No_Count_In_String_ascending_order> {
	public int count;
	public Character ch;

	@Override
	public int compareTo(No_Count_In_String_ascending_order et) {
		return et.count - this.count;
	}
}
