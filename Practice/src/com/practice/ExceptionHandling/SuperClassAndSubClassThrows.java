package com.practice.ExceptionHandling;

public class SuperClassAndSubClassThrows {

}

class SuperClass {
	double m1() throws RuntimeException {
		return 1;
	}
}

class SubClass extends SuperClass {
	double m1() {
		return 2.0;
	}
}
