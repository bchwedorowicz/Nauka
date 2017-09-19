package pl.java.cartesian;

public class Point {

	private static int nextId = 0;
	private int id;
	private final double x;
	private final double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
		id = nextId++;
	}

	public static void resetIdGenerator() {
		nextId = 0;
	}
//distance = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
	public double distance(Point p) {
		double xDifference = x - p.x;
		double yDifference = y - p.y;
		return Math.sqrt(Math.pow((xDifference), 2) + Math.pow((yDifference), 2));

	}

	public int getId() {
		return id;
	}
	
	public static int getNextId() {
		return nextId;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}

}
