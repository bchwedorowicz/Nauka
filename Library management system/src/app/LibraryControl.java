package app;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import data.Book;
import data.Library;
import data.LibraryUser;
import data.Magazine;
import utils.DataReader;
import utils.FileManager;
import utils.LibraryUtils;

public class LibraryControl {

    // zmienna do komunikacji z u¿ytkownikiem
    private DataReader dataReader;
    private FileManager filemanager;

    // "biblioteka" przechowuj¹ca dane
    private Library library;

    public LibraryControl() {
	dataReader = new DataReader();
	filemanager = new FileManager();
	try {
	    library = filemanager.readLibraryFromFile();
	    System.err.println("Wczytano dane biblioteki z pliku ");
	} catch (ClassNotFoundException | IOException e) {
	    library = new Library();
	    e.printStackTrace();
	    System.err.println("Utworzono now¹ bazê biblioteki.");
	}
    }

    /**
     * Main program's loop, which allows to choose the option and interaction
     */
    public void controlLoop() throws IOException, ClassNotFoundException {
	filemanager.readLibraryFromFile();
	Option option = null;
	while (option != Option.EXIT) {
	    try {
		printOptions();
		option = Option.createFromInt(dataReader.getInt());
		switch (option) {
		case ADD_BOOK:
		    addBook();
		    break;
		case ADD_MAGAZINE:
		    addMagazine();
		    break;
		case PRINT_BOOKS:
		    printBooks();
		    break;
		case PRINT_MAGAZINES:
		    printMagazines();
		    break;
		case ADD_USER:
		    addUser();
		    break;
		case PRINT_USERS:
		    printUsers();
		    break;
		case EXIT:
		    exit();
		    break;
		}
	    } catch (InputMismatchException e) {
		System.out.println("Wprowadzono niepoprawne dane, publikacji nie dodano");
	    } catch (NumberFormatException | NoSuchElementException e) {
		System.out.println("Wybrana opcja nie istnieje, wybierz ponownie:");
	    }
	}
	// zamykamy strumieñ wejœcia
	dataReader.close();
    }

    private void printOptions() {
	System.out.println("Wybierz opcjê: ");
	for (Option o : Option.values()) {
	    System.out.println(o);
	}
    }

    private void addBook() throws IOException {
	Book book = dataReader.readAndCreateBook();
	library.addBook(book);
    }

    private void printBooks() {
	LibraryUtils.printBooks(library);
    }

    private void addMagazine() {
	Magazine magazine = dataReader.readAndCreateMagazine();
	library.addMagazine(magazine);
    }

    private void printMagazines() {
	LibraryUtils.printMagazines(library);
    }

    private void addUser() {
	LibraryUser user = dataReader.readAndCreateLibraryUser();
	library.addUser(user);
    }

    private void printUsers() {
	LibraryUtils.printUsers(library);
    }

    private void exit() {
	try {
	    filemanager.writeLibraryToFile(library);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
