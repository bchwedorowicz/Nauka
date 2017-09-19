package pl.java.shapes;

import pl.java.cartesian.CartesianCoordinateSystem;

public class Triangle extends Shape {

	private double a = 0;
	private double b = 0;
	private double c = 0;

	
	public Triangle(double a, double b, double c) {
		super(3);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double getArea() {
		double p = (a + b + c)/2;
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		double roundArea = Math.round((area*100)/100);
		return roundArea;
	}

	@Override
	public double getSide(int index) {
		if (index == 0) {
			return a;
		}
		if (index == 1) {
			return b;
		}
		if (index == 2) {
			return c;
		}
		return -1;
	}
	@Override
	public int getNumSides() {
		return super.getNumSides();
	}
	

}
