package com.practice.main;

import java.lang.reflect.Constructor;

public class SingleTonChecker {
	public static SingleTonChecker obj = null;

	private SingleTonChecker() {

	}

	public static SingleTonChecker getSingleTonChecker() {
		if (obj == null)
			obj = new SingleTonChecker();
		return obj;
	}
}

