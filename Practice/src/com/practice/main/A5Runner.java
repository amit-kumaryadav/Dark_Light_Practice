package com.practice.main;

class A5{
	public void print(){
		System.out.println("C5");
	}
}
class B5 extends A5{
}
class C5 extends B5 implements B5_intf{
public void print(){
	System.out.println("C5");
}
}
interface B5_intf{
	public void print();
}
public class A5Runner{
public static void main(String args[]){
	A5 a5 = new C5();
	C5 c5 = new C5();
	if(a5 instanceof C5)
		System.out.println("C5 instance");
	if(a5 instanceof B5)
		System.out.println("B5 instance");
	if(a5 instanceof B5_intf)
		System.out.println("B5_intf instance");
	if(a5 instanceof A5)
		System.out.println("A5 instance");
	System.out.println(c5.hashCode());
	System.out.println(a5.hashCode());
	}
}