package pl.java.shapes;

public class Circle extends Shape implements Resizeable {

	private double radius;

	public Circle(double radius) {
		super(1);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public void resize(double x) {
		radius = radius * x;
	}

	@Override
	public double getSide(int index) {
		if (index == 0) {
			return 2 * Math.PI * radius;
		}
		return -1;

	}
}
