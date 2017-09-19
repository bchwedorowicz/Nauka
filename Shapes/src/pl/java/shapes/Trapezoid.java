package pl.java.shapes;

public class Trapezoid extends Shape {
	
	private double a = 0;
	private double b = 0;
	private double h = 0;

	public Trapezoid(double a, double b, double h) {
		super(4);
		this.a = a;
		this.b = b;
		this.h = h;
		}

	@Override
	public double getSide(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getArea() {
		return ((a + b)* h)/2;
	}
	
	

}
