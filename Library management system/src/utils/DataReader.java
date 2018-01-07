package utils;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import data.Book;
import data.LibraryUser;
import data.Magazine;

public class DataReader {

    private Scanner sc;

    public DataReader() {
	sc = new Scanner(System.in);
    }

    public void close() {
	sc.close();
    }

    public int getInt() {
	try {
	    return sc.nextInt();
	} catch (InputMismatchException e) {
	    // to remove incorrect input from Scanner
	    sc.nextLine();
	    throw new NumberFormatException("Liczba wprowadzona w niepoprawnej formie");
	}
    }

    public Book readAndCreateBook() {
	System.out.println("Tytu³: ");
	String title = sc.nextLine();
	System.out.println("Autor: ");
	String author = sc.nextLine();
	System.out.println("Wydawnictwo: ");
	String publisher = sc.nextLine();
	System.out.println("ISBN: ");
	String isbn = sc.nextLine();
	System.out.println("Rok wydania: ");
	int year = getInt();
	LocalDate date = LocalDate.of(year, 0, 0);
	sc.nextLine();
	System.out.println("Iloœæ stron: ");
	int pages = getInt();
	sc.nextLine();
	return new Book(date, title, publisher, author, pages, isbn);
    }

    public Magazine readAndCreateMagazine() {
	System.out.println("Tytu³: ");
	String title = sc.nextLine();
	System.out.println("Wydawnictwo: ");
	String publisher = sc.nextLine();
	System.out.println("Jêzyk: ");
	String language = sc.nextLine();
	System.out.println("Rok wydania: ");
	int year = getInt();
	sc.nextLine();
	System.out.println("Miesi¹c: ");
	int month = getInt();
	sc.nextLine();
	System.out.println("Dzieñ: ");
	int day = getInt();
	sc.nextLine();
	LocalDate date = LocalDate.of(year, month, day);
	return new Magazine(date, title, publisher, language);
    }

    public LibraryUser readAndCreateLibraryUser() {
	System.out.println("Imiê: ");
	String firstName = sc.nextLine();
	System.out.println("Nazwisko ");
	String lastName = sc.nextLine();
	System.out.println("PESEL: ");
	String pesel = sc.nextLine();

	return new LibraryUser(firstName, lastName, pesel);
    }
}
