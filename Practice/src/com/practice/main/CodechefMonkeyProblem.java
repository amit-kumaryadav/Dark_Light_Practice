package com.practice.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CodechefMonkeyProblem {
	public static void main(String[] args) throws java.lang.Exception {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Enter your name");
		int name = Integer.parseInt(br.readLine());
		System.out.println("Welcome " + name);
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for (int i = 0; i < test; i++) {
			int height = scanner.nextInt();
			int jump = scanner.nextInt();
			int slip = scanner.nextInt();
			int tempHeight = 0;
			float count = 0;
			while (true) {
				count++;
				tempHeight += jump;
				if (tempHeight >= height) {
					if (tempHeight == height) {
						System.out.printf("%.2f", count);
						break;
					}
					if (tempHeight > height) {
						tempHeight -= jump;
						tempHeight = height - tempHeight;
						float temp = tempHeight / (float) jump;
						count = count + temp - 1;
						System.out.printf("%.2f", count);
						break;
					}
				} else {
					tempHeight -= slip;
				}
			}
		}
	}
}
