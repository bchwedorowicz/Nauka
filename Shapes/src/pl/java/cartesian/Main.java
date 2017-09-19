package pl.java.cartesian;

import pl.java.shapes.Rectangle;
import pl.java.shapes.Shape;
import pl.java.shapes.Trapezoid;
import pl.java.shapes.Triangle;

public class Main {
	// Create class Point:
	// - static field nextId - used to assign id in constructor (make sure every
	// object has different id)
	// - field id - unique identifier of an point
	// - final fields x, y - which are point's coordinates
	// - static method resetIdGenerator() - which resets nextId to 0 (do you know
	// why static method ?)
	// - method double distance(Point p) which returns absolute distance between
	// this point and 'p'
	//
	// Create class CartesianCoordinateSystem
	// - field with array of potential Points (default size = 5, but can be changed
	// using parametric construtor)
	// - method addPoint(Point p) which adds point to this Cartesian system
	// - method Shape getShape() - which returns shape (use the one created
	// yesterday) basing on current points or null if shape is unknown
	// - make sure you support following shapes: Triangle(any triangle not just
	// equilateral triangle), Rectangle, Trapezoid, Parallelogram

	public static void main(String[] args) {
		CartesianCoordinateSystem cord1 = new CartesianCoordinateSystem(3);
		// x=2, y=1
		Point pt1 = new Point(2, 1);
		Point pt2 = new Point(6, 1);
		Point pt3 = new Point(4, 4);

		if (pt1.getId() != 0 || pt2.getId() != 1 || pt3.getId() != 2) {
			System.out.println("nie dzialo nadawnie id");
		}

		cord1.addPoint(pt1);
		cord1.addPoint(pt2);
		cord1.addPoint(pt3);

		Shape triangle = cord1.getShape();

		if (!(triangle instanceof Triangle)) {
			System.out.println("mial byc trojkat a jest " + (triangle != null ? triangle.getClass() : null));
		}

		if (triangle.getArea() != 6.0) {
			System.out.println("nie dziala liczenie pola trojkata bo mialo byc 6 a jest " + triangle.getArea());
		}

		CartesianCoordinateSystem cord2 = new CartesianCoordinateSystem();
		Point.resetIdGenerator();
		// x=2, y=1
		Point pr1 = new Point(1, 1);
		Point pr2 = new Point(1, 4);
		Point pr3 = new Point(4, 1);
		Point pr4 = new Point(4, 4);

		if (pr1.getId() != 0 || pr2.getId() != 1 || pr3.getId() != 2 || pr4.getId() != 3) {
			System.out.println("nie dzialo nadawnie id");
		}

		cord2.addPoint(pr1);
		cord2.addPoint(pr2);
		cord2.addPoint(pr3);
		cord2.addPoint(pr4);

		Shape rectangle = cord2.getShape();

		if (!(rectangle instanceof Rectangle)) {
			System.out.println("mial byc Rectangle a jest " + (rectangle != null ? rectangle.getClass() : null));
		}

		if (rectangle.getArea() != 9.0) {
			System.out.println("nie dziala liczenie pola prostokata bo mialo byc 9 a jest " + rectangle.getArea());
		}

		if (rectangle.getPerimeter() != 12.0) {
			System.out.println(
					"nie dziala liczenie obwodu prostokata bo mialo byc 12 a jest " + rectangle.getPerimeter());
		}

		CartesianCoordinateSystem cord3 = new CartesianCoordinateSystem(4);
		Point.resetIdGenerator();

		Point pz1 = new Point(1, 1);
		Point pz2 = new Point(3, 4);
		Point pz3 = new Point(7, 1);
		Point pz4 = new Point(5, 4);

		cord3.addPoint(pz1);
		cord3.addPoint(pz2);
		cord3.addPoint(pz3);
		cord3.addPoint(pz4);

		Shape trapezoid = cord3.getShape();

		if (!(trapezoid instanceof Trapezoid)) {
			System.out.println("mial byc Trapezoid a jest " + (trapezoid != null ? trapezoid.getClass() : null));
		}

		if (trapezoid.getArea() != 12.0) {
			System.out.println("nie dziala liczenie pola trapeza bo mialo byc 12 a jest " + trapezoid.getArea());
		}

		if (trapezoid.getPerimeter() != 16.0) {
			System.out.println("nie dziala liczenie obwodu trapeza bo mialo byc 16 a jest " + trapezoid.getPerimeter());
		}

		CartesianCoordinateSystem cord4 = new CartesianCoordinateSystem(4);

		Point p1 = new Point(1, 1);
		Point p2 = new Point(3, 4);
		Point p3 = new Point(7, 1);
		Point p4 = new Point(3, 3);
		cord4.addPoint(p1);
		cord4.addPoint(p2);
		cord4.addPoint(p3);
		cord4.addPoint(p4);

		Shape shape = cord4.getShape();
		if (shape != null) {
			System.out.println("powinno byæ null a jest " + shape.getClass());
		}

	}

}
