package pl.java.cartesian;

import pl.java.shapes.Rectangle;
import pl.java.shapes.Shape;
import pl.java.shapes.Trapezoid;
import pl.java.shapes.Triangle;

public class CartesianCoordinateSystem {

	private int pointsCount;

	private Point[] points;

	public CartesianCoordinateSystem() {
		this(5);
	}

	public CartesianCoordinateSystem(int arraySize) {
		points = new Point[arraySize];
	}

	public void addPoint(Point pt1) {
		points[pointsCount] = pt1;
		pointsCount++;

	}

	public Shape getShape() {
		if (pointsCount == 3) {
			double a = points[0].distance(points[1]);
			double b = points[1].distance(points[2]);
			double c = points[2].distance(points[0]);
			Triangle triangle = new Triangle(a, b, c);
			return triangle;
		}
		if (pointsCount == 4) {
			Rectangle rec = getRectangle();
			if (rec != null) {
				return rec;
			}
			Trapezoid tra = getTrapezoid();
			if (tra != null) {
				return tra;
			}

		}
		return null;
	}

	private Rectangle getRectangle() {
		for (int i = 1; i < pointsCount; i++) {
			if (points[0].getX() != points[i].getX() && points[0].getY() != points[i].getY()) {
				double x = (points[0].getX() + points[i].getX())/2;
				double y = (points[0].getY() + points[i].getY())/2;
				Point middlePoint = new Point(x,y); 
			}
		}
		double a = 0;
		double b = 0;
		for (int i = 0; i < pointsCount; i++) {
			for (int j = i + 1; j < pointsCount; j++) {
				if (points[i].getX() == points[j].getX()) {
					a = points[i].distance(points[j]);
				}
				if (points[i].getY() == points[j].getY()) {
					b = points[i].distance(points[j]);
				}
			}
		}
		if (a != 0 && b != 0) {
			Rectangle rectangle = new Rectangle(a, b);
			return rectangle;
		}
		return null;
	}

	private Trapezoid getTrapezoid() {
		double a = 0;
		double b = 0;
		double h = 0;
		for (int i = 0; i < pointsCount; i++) {
			for (int j = i + 1; j < pointsCount; j++) {
				Point p1 = points[i];
				Point p2 = points[j];
				double distance = p1.distance(p2);
				if (p1.getY() == p2.getY() && (distance > a)) {
					a = distance;
					continue;
				} else if (p1.getY() == p2.getY() && (distance != a)) {
					b = distance;
				}
				if (p1.getY() > p2.getY()) {
					h = p1.getY() - p2.getY();
				}
			}
		}
		if (a != 0 && b != 0 && h != 0) {
			Trapezoid trapezoid = new Trapezoid(a, b, h);
			return trapezoid;
		}
		return null;
	}

	public int getPointsCount() {
		return pointsCount;
	}

	public Point[] getPoints() {
		return points;
	}
}
