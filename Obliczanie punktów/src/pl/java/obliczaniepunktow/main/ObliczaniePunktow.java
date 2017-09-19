package pl.java.obliczaniepunktow.main;

import java.util.Scanner;

public class ObliczaniePunktow {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj punkty za styl");
		int styl = scanner.nextInt();
		System.out.println("Podaj punkty za efekty");
		int efekty = scanner.nextInt();
		System.out.println("Podaj punkty za rezultat");
		int rezultat = scanner.nextInt();
		
		double suma = styl*0.2 + efekty*0.3 + rezultat*0.5;
		double dzielenie = (double)styl/efekty;
		
		System.out.println("Suma punktów: " + suma + " " + dzielenie);
	}

}
