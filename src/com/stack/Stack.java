package com.stack;

public class Stack {
	public static void main(String[] args) {
		Person p1 = new Person("Vivek", "901804034");
		Person p2 = new Person("Vijay", "901814034");
		
		PersonStack ps = new PersonStack();
		
		ps.push(p1);
		ps.push(p2);
		
		System.out.println(ps.pop().toString());
		System.out.println(ps.pop().toString());
	}
}
