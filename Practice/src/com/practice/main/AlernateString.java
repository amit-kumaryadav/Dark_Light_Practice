package com.practice.main;

import java.util.Arrays;

public class AlernateString {
	public static void main(String[] args) {
		System.out.println(isValid("aabbccddeefghi"));
	}

	static int alternatingCharacters(String s) {
		char[] charArry = s.toCharArray();
		int j = 0;
		int count = 0;
		for (int i = 0; i < charArry.length; i++) {
			System.out.println(charArry[i]);
			if (charArry.length > 1 && i < charArry.length - 1) {
				char ch = charArry[i + 1];
				if (charArry[j] == ch) {
					count++;
				} else {
					j = i + 1;
				}

			}
		}
		return count;
	}

	static int makeAnagram(String a, String b) {
		int length1 = a.length();
		int length2 = b.length();
		int[] charCount1 = new int[256];
		Arrays.fill(charCount1, 0);
		int[] charCount2 = new int[256];
		Arrays.fill(charCount2, 0);
		char[] charArr1 = a.toCharArray();
		char[] charArr2 = b.toCharArray();
		int count = 0;
		int itr = length1 > length2 ? length1 : length2;
		for (int i = 0; i < itr; i++) {
			if (i < length1)
				charCount1[charArr1[i]] = charCount1[charArr1[i]] + 1;
			if (i < length2)
				charCount2[charArr2[i]] = charCount2[charArr2[i]] + 1;
		}
		for (int i = 0; i < 255; i++) {
			if (charCount1[i] != charCount2[i]) {
				if (charCount1[i] > charCount2[i]) {
					count = count + (charCount1[i] - charCount2[i]);
				} else {
					count = count + (charCount2[i] - charCount1[i]);
				}
			}
		}
		return count;
	}

	static String isValid(String s) {

		char[] chaArr = s.toCharArray();
		int[] intArr = new int[256];
		int max = 0;
		boolean isCritical = false;
		boolean isMaxAssigned = false;
		Arrays.fill(intArr, 0);
		int charLength = chaArr.length;
		for (int i = 0; i < charLength; i++) {
			intArr[chaArr[i]] = intArr[chaArr[i]] + 1;
		}
		for (int i = 0; i < 256; i++) {
			if (max < intArr[i] && !isMaxAssigned) {
				max = intArr[i];
				isMaxAssigned = true;
			} else if (max != intArr[i] && intArr[i] != 0) {
				if (max > intArr[i] && ((max - 1) == intArr[i]) && !isCritical) {
					isCritical = true;
					max = max - 1;
					continue;
				} else if (max < intArr[i] && ((max + 1) == intArr[i]) && !isCritical) {
					isCritical = true;
					max = intArr[i] - 1;
					continue;
				} else if (max != intArr[i]) {
					return "NO";
				}
			}
		}
		return "YES";
	}

}
