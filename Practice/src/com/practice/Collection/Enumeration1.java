package com.practice.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Enumeration1 {
public static void main(String args[]) {
	Vector v1 = new Vector();
	ArrayList al = new ArrayList();
	v1.add('a');
	v1.add(1);
	al.add('a');
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	Enumeration  enu = v1.elements();
//	while(enu.hasMoreElements()) {
//		v1.remove(1);
//		System.out.println(enu.nextElement());
//	}
	Enumeration  enu1 = Collections.enumeration(al);
//	while(enu1.hasMoreElements()) {
////		if(enu1.nextElement() instanceof Integer)
////		al.remove(enu1.nextElement());
////		System.out.println(enu1.nextElement());
//	}
	Iterator itr = al.iterator();
	while(itr.hasNext()) 
	{	
		System.out.println(itr.next());
		itr.remove();
	}
}
}
