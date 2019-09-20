package com.practice.main;

import java.util.Arrays;

public class AnagramOfTwoString {

	public static void main(String[] args) {
		String A = "Amit";
		String B = "miAt";
		char[] aChar = A.toCharArray();
		char[] bChar = B.toCharArray();
		Arrays.sort(aChar);
		Arrays.sort(bChar);
		boolean status = Arrays.equals(aChar, bChar);
		if(status)
		System.out.println("Given Two String are Anagram::!");

	}

}
