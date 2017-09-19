package pl.java.liczbypierwsze.pakiet;
import java.util.Scanner;

public class LiczbyPierwsze {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int liczba = scanner.nextInt();
		System.out.println(liczba);
		boolean liczbaPierwsza = true;

		for (int i = 2; i <= liczba / 2; i++) {

			if (liczba % i == 0) {
				liczbaPierwsza = false;
				break;
			}
		}

		if (liczba == 0 || liczba == 1) {
			liczbaPierwsza = false;
		}
		if (liczbaPierwsza) {
			System.out.println("Liczba pierwsza");
		} else {
			System.out.println("Nie jest liczba pierwsza");
		}

	}

}
