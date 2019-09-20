package com.practice.main;

import java.lang.reflect.Constructor;

public class CFG {

	public static void main(String[] args) {
		SingleTonChecker instance1 = SingleTonChecker.getSingleTonChecker();
		SingleTonChecker instance2 = null;
		try {
			Constructor[] constructor = SingleTonChecker.class.getDeclaredConstructors();
			for (Constructor cons : constructor) {
				cons.setAccessible(true);
				instance2 = (SingleTonChecker)cons.newInstance();
				break;
			}
			{
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
System.out.println(instance1.hashCode());
System.out.println(instance2.hashCode());
	}
}