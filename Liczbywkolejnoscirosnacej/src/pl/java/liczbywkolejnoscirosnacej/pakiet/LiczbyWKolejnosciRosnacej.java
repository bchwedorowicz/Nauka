package pl.java.liczbywkolejnoscirosnacej.pakiet;
import java.util.Scanner;

public class LiczbyWKolejnosciRosnacej {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbe");
		int liczba1 = scanner.nextInt();
		System.out.println("Podaj liczbe");
		int liczba2 = scanner.nextInt();
		System.out.println("Podaj liczbe");
		int liczba3 = scanner.nextInt();

		if (liczba1 > 100 || liczba1 < 0 || liczba2 > 100 || liczba2 < 0 || liczba3 > 100 || liczba3 < 0) {
			System.out.println("Podaj liczby z przedzia³u od 0 do 100");
		} else {
			if (liczba3 > liczba2 && liczba3 > liczba1 && liczba2 > liczba1) {
				System.out.println("Liczby w kolejnoœci rosn¹cej: " + liczba1 + " " + liczba2 + " " + liczba3);
			} else if (liczba2 > liczba3 && liczba2 > liczba1 && liczba3 > liczba1) {
				System.out.println("Liczby w kolejnoœci rosn¹cej: " + liczba1 + " " + liczba3 + " " + liczba2);
			} else if (liczba2 > liczba1 && liczba2 > liczba3 && liczba1 > liczba3) {
				System.out.println("Liczby w kolejnoœci rosn¹cej: " + liczba3 + " " + liczba1 + " " + liczba2);
			} else if (liczba3 > liczba1 && liczba3 > liczba2 && liczba1 > liczba2) {
				System.out.println("Liczby w kolejnoœci rosn¹cej: " + liczba2 + " " + liczba1 + " " + liczba3);
			} else if (liczba1 > liczba3 && liczba1 > liczba2 && liczba3 > liczba2) {
				System.out.println("Liczby w kolejnoœci rosn¹cej: " + liczba2 + " " + liczba3 + " " + liczba1);
			} else {
				System.out.println("Liczby w kolejnoœci rosn¹cej: " + liczba3 + " " + liczba2 + " " + liczba1);
			}
		}

}
}
