package pl.java.debt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	// wyciagnac do metod case ze switch (ctrl+1);
	// porobiæ sta³e do switch;

	private static final int PRINT_LIST = 1;
	private static final int ADD_DEBTOR = 2;
	private static final int PAY_DEPOSIT = 3;
	private static final int WRITE_TO_FILE = 4;
	private static final int READ_FROM_FILE = 5;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Press 1 to use CSV file or press any other button to use serialize file");
		int button = sc.nextInt();

		List<Debtor> debtors = new ArrayList<Debtor>();

		FileStorage storage;
		if (button == 1) {
			storage = new CSVFileStorage();
		} else {
			storage = new SerializeFileStorage();
		}
		
		System.out.println("View the list of debtors - press 1");
		System.out.println("Add debtor - press 2");
		System.out.println("Edit debt - press 3");
		System.out.println("Save to file - press 4");
		System.out.println("Load from file - press 5");

		button = sc.nextInt();


		while (button != 0) {

			switch (button) {
			case PRINT_LIST:
				printDebtorsList(debtors);
				break;
			case ADD_DEBTOR:
				addDebtors(sc, debtors);
				break;
			case PAY_DEPOSIT:
				payDeposit(sc, debtors);
				break;
			case READ_FROM_FILE:
				debtors = storage.readFromFile();
				break;
			case WRITE_TO_FILE:
				storage.writeToFile(debtors);
				break;

			default:
				System.out.println("Give the number 1-5");
				break;

			}
			System.out.println("Are we ending today? - press 0");
			button = sc.nextInt();
		}
	}

	private static void payDeposit(Scanner sc, List<Debtor> debtors) {
		System.out.println("Give the debtor`s number");
		int nr = sc.nextInt();
		System.out.println(debtors.get(nr - 1));
		System.out.println("What amount do you want to deposit?");
		double amount = sc.nextDouble();
		Debtor currentDebtor = debtors.get(nr - 1);
		double currentDebt = currentDebtor.getDebt() - amount;
		currentDebtor.setDebt(currentDebt);
		if (currentDebt == 0) {
			debtors.remove(currentDebtor);
		}
	}

	private static void addDebtors(Scanner sc, List<Debtor> debtors) {
		System.out.println("Give the debtor`s first name");
		String fName = sc.next();
		System.out.println("Give the debtor`s last name");
		String lName = sc.next();
		System.out.println("Give the debtor`s debt value");
		double debt = sc.nextDouble();
		debtors.add(new Debtor(fName, lName, debt));
	}

	private static void printDebtorsList(List<Debtor> debtors) {
		int number = 0;
		for (Debtor debtor : debtors) {
			System.out.println(++number + " " + debtor);
		}
	}
}
