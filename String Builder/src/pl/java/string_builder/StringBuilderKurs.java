package pl.java.string_builder;

import java.util.Scanner;

public class StringBuilderKurs {
	
//	Pobierz od u¿ytkownika liczbê, która okreœlaæ bêdzie ile wyrazów u¿ytkownik chce wprowadziæ. 
//	Nastêpnie wczytaj od niego listê ci¹gów znaków na podstawie, których wygenerujesz wynik.
//
//	Wynikiem jest wyraz sk³adaj¹cy siê z ostatnich liter ka¿dego z wprowadzonych s³ów. Wykorzystaj klasy String i StringBuilder.
//
//	Przyk³adowe wejœcie:
//
//	5
//	Roman
//	kratka
//	kanar
//	robot
//	nuty
//
//	Wyjœcie
//
//	narty

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Words number:");
		int nr = sc.nextInt();
		int loopNr = 0;
		StringBuilder sB = new StringBuilder();
		while (nr != loopNr++) {
			System.out.println("Word:");
			String word = sc.next();
			sB.append(word.substring(word.length()-1));
		}
		String endWord = sB.toString();
		System.out.println(endWord);
		sc.close();

	}
}
