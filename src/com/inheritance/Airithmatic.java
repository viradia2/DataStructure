package com.inheritance;

public class Airithmatic {
	
	public static void main(String[] args) {
		Airithmatic m = new Multiplication();
		m.opertaion(5, 10);
		Airithmatic a = new Addition();
		a.opertaion(10, 20);
		Airithmatic s = new Subtract();
		s.opertaion(10, 2);
		Airithmatic d = new Divide();
		d.opertaion(10, 2);
	}
	public void opertaion(int a, int b){
		int sum = a+b;
		System.out.println("Addition: " + sum);
	}
}

class Multiplication extends Airithmatic{
	
	@Override
	public void opertaion(int a, int b) {
		// TODO Auto-generated method stub
		int output = a * b;
		System.out.println("Multiplication: " + output);
	}
}

class Addition extends Airithmatic{
	@Override
	public void opertaion(int a, int b) {
		// TODO Auto-generated method stub
		super.opertaion(a, b);
	}
}

class Divide extends Airithmatic{
	@Override
	public void opertaion(int a, int b) {
		// TODO Auto-generated method stub
		double division = a/b;
		System.out.println("Division: " + division);
	}
}

class Subtract extends Airithmatic{
	@Override
	public void opertaion(int a, int b) {
		// TODO Auto-generated method stub
		int subtraction = a - b;
		System.out.println("Subtraction: " + subtraction);
	}
}
