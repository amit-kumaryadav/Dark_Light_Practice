package com.practice.main;

//Java program to demonstrate 
//the case if superclass need 
//not to be serializable 
//while serializing subclass 

import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.io.Serializable;; 

//superclass A 
//A class doesn't implement Serializable 
//interface. 
class A 
{ 
	int i; 
	public static int k = 20;
	// parameterized constructor 
	public A(int i) 
	{ 
		this.i = i; 
	} 
	
	// default constructor 
	// this constructor must be present 
	// otherwise we will get runtime exception 
	public A() 
	{ 
		i = 50;
		k = 30;
		System.out.println("A's class constructor called"); 
	} 
	
} 

//subclass B 
//implementing Serializable interface 
class B extends A implements Serializable 
{ 
	int j; 
	
	// parameterized constructor 
	public B(int i,int j) 
	{ 
		super(i); 
		this.j = j; 
	} 
} 

//Driver class 
public class Test 
{ 
	public static void main(String[] args) 
			throws Exception 
	{ 
		B b1 = new B(10,20); 
		
		System.out.println("i = " + b1.i); 
		System.out.println("j = " + b1.j); 
		b1.k = 1200;
		// Serializing B's(subclass) object 
		
		//Saving of object in a file 
		FileOutputStream fos = new FileOutputStream("/home/dell/Desktop/serialization1"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
			
		// Method for serialization of B's class object 
		oos.writeObject(b1); 
			
		// closing streams 
		oos.close(); 
		fos.close(); 
			
		System.out.println("Object has been serialized"); 
		
		// De-Serializing B's(subclass) object 
		
		// Reading the object from a file 
		FileInputStream fis = new FileInputStream("/home/dell/Desktop/serialization1"); 
		ObjectInputStream ois = new ObjectInputStream(fis); 
			
		// Method for de-serialization of B's class object 
		B b2 = (B)ois.readObject(); 
			
		// closing streams 
		ois.close(); 
		fis.close(); 
			
		System.out.println("Object has been deserialized"); 
		
		System.out.println("i = " + b2.i); 
		System.out.println("j = " + b2.j); 
		System.out.println("k = " + b2.k); 
	} 
} 
