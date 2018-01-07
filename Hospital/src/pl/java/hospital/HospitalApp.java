package pl.java.hospital;

import java.util.Scanner;

public class HospitalApp {
	//// Napisz program symuluj¹cy system do planowania wizyt w szpitalu.
	// Program powinien sk³adaæ siê z trzech klas:
	////
	//// Patient - klasa przechowuj¹ca dane o pacjencie (imiê, nazwisko, PESEL) -
	// klasa powinna byæ zgodna z konwencj¹ JavaBeans
	//// Hospital - klasa z logik¹ aplikacji umo¿liwiaj¹ca dopisanie pacjenta do
	// kolejki oraz wyœwietlenie wszystkich zapisanych pacjentów
	//// HospitalApp - klasa startowa programu, która posiada trzy opcje: 0 -
	// wyjœcie z programu, 1 - dopisanie pacjenta, 2 - wyœwietlenie listy zapisanych
	//// pacjentów
	//// Ograniczenia:
	////
	//// Danego dnia mo¿e zapisaæ siê co najwy¿ej 10 pacjentów, przy próbie
	// zapisania kolejnego wyœwietlana jest informacja o tym, ¿e dzisiaj limit
	//// zosta³ ju¿ wyczerpany
	//// Aplikacja powinna dzia³aæ do tego momentu, a¿ u¿ytkownik nie wybierze opcji
	//// 0,
	// czyli wyjœcia z programu

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
