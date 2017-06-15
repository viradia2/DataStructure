package com.inheritance;

public class Shape {
	public static void main(String[] args) {
		Shape s = new Circle(4);
		s.area();
		Shape s1 = new Rectangle(5, 10);
		s1.area();
		Shape s2 = new Square(5);
		s2.area();
		Shape s3 = new Triangle(5, 10);
		s3.area();
	}
	public void area(){
		System.out.println("Calculating Area: ");
	}
}

class Circle extends Shape{
	private int r;
	
	public Circle(int r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		super.area();
		double area = r * r * Math.PI;
		System.out.println(area);
	}
}
class Rectangle extends Shape{
	private int l, b;
	public Rectangle(int l, int b) {
		// TODO Auto-generated constructor stub
		this.l = l;
		this.b = b;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		super.area();
		int area = 2 * (l + b);
		System.out.println(area);
	}
}
class Triangle extends Shape{
	private int r, h;
	public Triangle(int r, int h) {
		// TODO Auto-generated constructor stub
		this.r = r;
		this.h = h;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		super.area();
		double area = 0.5 * r *r * h * Math.PI;
		System.out.println(area);
	}
}
class Square extends Shape{
	private int r;
	public Square(int r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		super.area();
		System.out.println((4 * r));
	}
}
