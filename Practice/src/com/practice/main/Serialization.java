package com.practice.main;

import java.io.Serializable;

class Serialization{
	public static final long SerialVersionUID = 10l;
	// its recommendation to write serialVersionUID in your class to help in
	// deserialization process
	// if serivalVersionUID not correctly received then it will give
	// invalidclassException
	// if we will not give then JVM will create default serialVersionUID
	// if we use different machine or remote machine then definitely it will give error
	int a = 1;
	static int b;
	final transient int c = 6;
	static{
		b = 10;
	}
}
class SerializationChield extends Serialization implements Serializable{
	//Employee emp = new Employee(1, "");
	//Employee class should implements Serializable interface
	transient int  d = 10;
}