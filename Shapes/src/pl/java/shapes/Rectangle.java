package pl.java.shapes;

public class Rectangle extends Shape implements Resizeable {

	private double height;
	private double width;
	


	public Rectangle(double height, double width) {
		super(4);
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea() {
		double area = height * width;
		double roundArea = Math.round((area*100)/100);
		return roundArea;
	}

	@Override
	public void resize(double x) {
		height = height * x;
		width = width * x;
	}

	@Override
	public double getSide(int index) {
		if (index == 0 || index == 2) {
			return height;
		} else if (index == 1 || index == 3) {
			return width;
		} 
		return -1;
	}
	
	@Override
	public int getNumSides() {
		return super.getNumSides();
	}

}
