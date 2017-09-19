package pl.java.pobierztekst.main;

import java.util.Scanner;

public class PobierzTekst {
	// Pobierz od u�ytkownika dowolny tekst, nast�pnie pobierz liczb�. Nast�pnie
	// spytaj, czy wydrukowa� dany tekst. W zale�no�ci od odpowiedzi, 1 oznacza tak,
	// 2 oznacza nie, wykonaj zadanie , tzn. wydrukuj tyle razy, jak� liczb� poda�
	// u�ytkownik. Je�li u�ytkownik wpisze co� innego ni� 1 lub 2, wypisz �nie
	// zrozumia�em, wybierz odpowied� jeszcze raz�.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give text");
		String text = scanner.next();
		System.out.println("Give number");
		int number = scanner.nextInt();
		System.out.println("Print the text? 1-->YES; 2-->NO");
		int answer = scanner.nextInt();

		while (answer != 2 && answer != 1) {
			System.out.println("I didn`t understand. Choose the answer again.");
			answer = scanner.nextInt();
		}
		if (answer == 1) {
			String text2 = "";
			for (int i = 1; i <= number; i++) {
				text2 += text + " ";
			}
			System.out.println(text2);

		}
	}
}
