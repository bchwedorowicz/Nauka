package pl.java.enumeratory;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Podaj kolor koszuli: ");
//		Scanner scanner = new Scanner(System.in);
//		String color = scanner.next();
//		System.out.println("Podaj rozmiar koszuli: ");
//		int size = scanner.nextInt();
//
//		Koszula koszula = new Koszula(color, size);
//		System.out.println("Twoja koszula ma kolor: " + koszula.getColor() + " a jej rozmiar to: " + koszula.getSize()
//				+ " " + koszula.getShirtSize().getNazwa());
//
//
//		switch (koszula.getShirtSize()) {
//		case S:
//			System.out.println("Jestes chudy");
//			break;
//		case M:
//			System.out.println("Jestes ok");
//			break;
//		case L:
//			System.out.println("Odchudzaæ sie!");
//			break;
//		}
		
		for (ShirtSize x: ShirtSize.values()) {
			System.out.println("Rozmiar: " + x + " " + x.getNazwa());
		}

	}

}
