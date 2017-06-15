package com.inheritance;

public class IshapeTest {
	public static void main(String[] args) {
		IShape circle = new CircleN(5);
		circle.area();
	}
}

interface IShape{
	public void area();
}

class CircleN implements IShape{
	private int r;
	
	public CircleN(int r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		double area = r * r * Math.PI;
		System.out.println(area);
	}
}

class RectangleN implements IShape{
	private int l, b;
	public RectangleN(int l, int b) {
		// TODO Auto-generated constructor stub
		this.l = l;
		this.b = b;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		int area = 2 * (l + b);
		System.out.println(area);
	}
}
class TriangleN implements IShape{
	private int r, h;
	public TriangleN(int r, int h) {
		// TODO Auto-generated constructor stub
		this.r = r;
		this.h = h;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		double area = 0.5 * r *r * h * Math.PI;
		System.out.println(area);
	}
}
class SquareN implements IShape{
	private int r;
	public SquareN(int r) {
		// TODO Auto-generated constructor stub
		this.r = r;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println((4 * r));
	}
}

