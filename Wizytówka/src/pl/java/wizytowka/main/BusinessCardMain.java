package pl.java.wizytowka.main;

import java.util.Scanner;

public class BusinessCardMain {
	// Stw�rz system do robienia wizyt�wek. Odpytaj u�ytkownika o imi� (name),
	// nazwisko (surname), numer telefonu (telephone w typie int). Nast�pnie
	// wydrukuj to w �adny spos�b, tzn ramka i mo�e jakie� efekty, wedle woli i
	// ch�ci.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give name");
		String name = scanner.next();
		System.out.println("Give surname");
		String surname = scanner.next();
		System.out.println("Give telephone number");
		int telephone = scanner.nextInt();

		String telephone2 = String.valueOf(telephone);

		name = "Name: " + name;
		surname = "Surname: " + surname;
		telephone2 = "Tel. " + telephone2;

		int longest = name.length();

		longest = getLonger(longest, surname);
		longest = getLonger(longest, telephone2);

		String frame = "x x";
		for (int i = 0; i <= longest / 2; i++) {
			frame += " x";
		}

		name = addSpaces(name, longest);
		surname = addSpaces(surname, longest);
		telephone2 = addSpaces(telephone2, longest);

		System.out.println(frame);
		print(name);
		print(surname);
		print(telephone2);
		System.out.println(frame);

	}

	public static void print(String parametr) {
		System.out.println("x" + " " + parametr + "x");
	}

	public static String addSpaces(String parametr, int longest) {
		while (parametr.length() <= longest) {
			parametr += " ";
		}
		return parametr;
	}

	public static int getLonger(int longest, String parametr) {
		if (parametr.length() > longest) {
			longest = parametr.length();
		}
		return longest;
	}

}
