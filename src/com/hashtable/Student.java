package com.hashtable;

public class Student {
	//Class Properties
	private String name;
	private String roll_no;
	private double cgpa;
	
	//Class Constructor
	public Student(String name, String roll_no, double cgpa) {
		this.name = name;
		this.roll_no = roll_no;
		this.cgpa = cgpa;
	}
	
	//Getter and Setters for each class Properties.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String toString(){
		return "Name: " + name + " Roll_No: " + roll_no + " CGPA: " + cgpa;
	}
}
