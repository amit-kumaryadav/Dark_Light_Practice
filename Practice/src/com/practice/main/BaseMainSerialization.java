package com.practice.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class BaseMainSerialization{
	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
	// above code is serialization of Serialization class
	//we can only serialize that class which has implements Serializable interface
	//Serializable interface is marker interface, cloneable and remote also maker interface
	// marker interface has no method.
	
		
		
	SerializationChield serialization = new SerializationChield();
	serialization.b = 100;
	FileOutputStream out = new FileOutputStream("/home/dell/Desktop/serialization");
	ObjectOutputStream objOut = new ObjectOutputStream(out);
	objOut.writeObject(serialization);
	out.close();
	objOut.close();

		//Now we will deserialize the value from the file
	FileInputStream inputStream = new FileInputStream("/home/dell/Desktop/serialization");
	ObjectInputStream objInput = new ObjectInputStream(inputStream);
	SerializationChield Deserialization = (SerializationChield)objInput.readObject();
	System.out.println(Deserialization.a +" "+ Deserialization.b + " "+ Deserialization.c + " "+Deserialization.d);
	}
}
