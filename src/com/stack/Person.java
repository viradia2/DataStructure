package com.stack;

public class Person {
	private String name;
	private String rollno;
	
	public Person(String name, String rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	public String toString() {
		return "Name: " + name + " rollno: " + rollno;
	}
}
