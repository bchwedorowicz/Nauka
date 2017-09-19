package exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
	// - create a class InvalidArgumentException extending class RuntimeException
	// - create a class NumberTooBigException extending class Exception
	//
	// - create a MathUtils class with only static methods (similar to
	// java.lang.Math)
	// -- create method factorial which takes int as argument and retruns factorial
	// of that number
	// --- if an argument is less than 0 then throw InvalidArgumentException
	// --- if an argument is more than 20 then throw NumberTooBigException
	//
	// - create main method with one try block and multiple catches
	// - read int from user and display factorial of that int.
	// - if user input is not a number then catch correct exception and display
	// correct error message
	// - handle all other exception cases we prepared
	//
	// - add constructor to NumberTooBigException which accepts int as a parameter
	// (the number passed to factorial method)
	// -- prepare proper message in this constructor and pass it to super
	// constructor.
	// -- use that message in exception handling code

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Give factorial");

			try {
				int f = sc.nextInt();
				System.out.println("Factorical: " + MathUtil.getFactorial(f));
				break;
			} catch (InputMismatchException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				sc.next(); // ¿eby wyci¹gn¹æ Stringa ze scannera
				System.err.println("Give a number.");
			} catch (InvalidArgumentException | NumberTooBigException e) {
				System.err.println(e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
