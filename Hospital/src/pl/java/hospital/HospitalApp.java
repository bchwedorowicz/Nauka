package pl.java.hospital;

import java.util.Scanner;

public class HospitalApp {
	//// Napisz program symuluj�cy system do planowania wizyt w szpitalu.
	// Program powinien sk�ada� si� z trzech klas:
	////
	//// Patient - klasa przechowuj�ca dane o pacjencie (imi�, nazwisko, PESEL) -
	// klasa powinna by� zgodna z konwencj� JavaBeans
	//// Hospital - klasa z logik� aplikacji umo�liwiaj�ca dopisanie pacjenta do
	// kolejki oraz wy�wietlenie wszystkich zapisanych pacjent�w
	//// HospitalApp - klasa startowa programu, kt�ra posiada trzy opcje: 0 -
	// wyj�cie z programu, 1 - dopisanie pacjenta, 2 - wy�wietlenie listy zapisanych
	//// pacjent�w
	//// Ograniczenia:
	////
	//// Danego dnia mo�e zapisa� si� co najwy�ej 10 pacjent�w, przy pr�bie
	// zapisania kolejnego wy�wietlana jest informacja o tym, �e dzisiaj limit
	//// zosta� ju� wyczerpany
	//// Aplikacja powinna dzia�a� do tego momentu, a� u�ytkownik nie wybierze opcji
	//// 0,
	// czyli wyj�cia z programu

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			Hospital hospital = new Hospital(sc);

			int scanner = -1;
			while (scanner != 0) {
				System.out.println(
						"If you want to read new patient: press 1. If you want to print patients list: press 2. If you want to go out of program: press 0.");
				scanner = sc.nextInt();
				switch (scanner) {
				case 1:
					hospital.readPatient();
					break;
				case 2:
					hospital.printPatientsList();
					break;
				}

			}
			System.out.println("The end");

		}
	}
}
