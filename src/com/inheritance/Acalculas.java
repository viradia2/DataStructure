package com.inheritance;

public class Acalculas{
	public static void main(String[] args) {
		Operation o = new Calculas();
		o.addition(5, 10);
		o.subtraction(10, 5);
	}	
}
class Calculas extends Operation{
	@Override
	public void Division(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Division: " + (a/b));
	}
}

abstract class Operation{
	
	public void addition(int a, int b){
		System.out.println("Addition: " + (a + b));
	}
	public void multiplication(int a, int b){
		System.out.println("Multiplication: " + (a * b));
	}
	public void subtraction(int a, int b){
		System.out.println("Subtraction: " + (a - b));
	}
	public abstract void Division(int a, int b);
}
