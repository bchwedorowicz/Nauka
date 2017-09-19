package pl.java.shapes;

import java.util.Arrays;

//1) Write an abstract class Shape
//– Data members: numSides
//– Constructor: initialize numSides 
//– Concrete method: get method for numSides
//– Abstract methods: getArea(), getPerimeter() 
//2) Write a concrete subclass Rectangle 
//– Data members: width, height 
//3) Write a concrete subclass Triangle 
//– Data members: width, height 
//4) Write a concrete subclass Circle 
//– Data members: radius
//4) In another class, write a main method:
//- create objects of Rectangle, Triangle and Circle.
//- create Array of Shape and place all created shapes there
//- For each of Shape print its area and perimeter
//7) Write an interface Resizable 
//– Has a method resize(double x) that resizes a Shape’s dimensions by factor x 
//😎 Make Rectangle and Circle implement Resizable 
//9) Write a main method to: 
//- Create rectangle
//- Print the Rectangle‟s area & perimeter 
//- Resize the Rectangle by factor of 2 
//- Re-print the Rectangle‟s area & perimeter
//- Create Array of Resizables and put all resizable objects there
//- Resize each objects by factor 0.75 and print its area and perimeter with precision of 2 digits

public class Main {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle(6, 8);
		Triangle tri = new Triangle(4.33, 5.0, 5.0);
		Circle cir = new Circle(7);

		Shape[] shapes = { rec, tri, cir };

		for (Shape abc : shapes) {
			System.out.println(abc.getClass().getSimpleName() + " " + abc.getArea() + " " + abc.getPerimeter());

		}

	}
}
