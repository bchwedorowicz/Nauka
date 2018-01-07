package pl.java.exercises;

import java.util.Scanner;

public class Exercises {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Podaj liczbe cyfr");
			int liczbaCyfr = sc.nextInt();
			int suma = 0;
			while (liczbaCyfr-- != 0) {
				System.out.println("Podaj cyfre");
				suma += sc.nextInt();
			}
			System.out.println("Suma:" + suma);
		}
	}
}
