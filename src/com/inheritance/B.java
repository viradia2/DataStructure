package com.inheritance;

public class B {
	public static void main(String[] args) {
		A a = new A();
		a.print();
	}
	public void print(){
		System.out.println("This is B");
	}
}

class A extends B{
	public void print(){
		System.out.println("This is A");
	}
}
