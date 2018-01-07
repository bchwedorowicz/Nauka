package pl.java.mapy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyApp {

	public static final int ADD = 1;
	public static final int SEARCH = 2;
	public static final int EXIT = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Company com = new Company(sc);
		int button = -1;

		try {

			while (button != EXIT) {
				System.out.println(
						"Press 1 to add employee" + "\n" + "Press 2 to search employee" + "\n" + "Press 0 to exit");
				button = sc.nextInt();
				if (button == ADD) {
					com.addEmployee();
				}
				if (button == SEARCH) {
					System.out.println("Give first name and last name:");
					com.searchEmployee(sc.next(), sc.next());
				}
			}
		} catch (InputMismatchException e) {
			e.getMessage();
			System.err.println("Give number");
		} finally {
			sc.close();
		}
	}
}