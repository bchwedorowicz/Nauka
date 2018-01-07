package pl.java.string_builder;

import java.util.Scanner;

public class StringBuilderKurs {
	
//	Pobierz od u�ytkownika liczb�, kt�ra okre�la� b�dzie ile wyraz�w u�ytkownik chce wprowadzi�. 
//	Nast�pnie wczytaj od niego list� ci�g�w znak�w na podstawie, kt�rych wygenerujesz wynik.
//
//	Wynikiem jest wyraz sk�adaj�cy si� z ostatnich liter ka�dego z wprowadzonych s��w. Wykorzystaj klasy String i StringBuilder.
//
//	Przyk�adowe wej�cie:
//
//	5
//	Roman
//	kratka
//	kanar
//	robot
//	nuty
//
//	Wyj�cie
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
