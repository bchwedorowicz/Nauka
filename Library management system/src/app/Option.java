package app;

import java.util.NoSuchElementException;

public enum Option {

    EXIT(0, "Wyj�cie z programu"), ADD_BOOK(1, "Dodanie ksi��ki"), ADD_MAGAZINE(2,
	    "Dodanie magazynu/ gazety"), PRINT_BOOKS(3, "Wy�wietlenie dost�pnych ksi��ek"), PRINT_MAGAZINES(4,
		    "Wy�wietlenie dost�pnych magazyn�w/ksi��ek"), ADD_USER(5,
			    "Dodanie nowego u�ytkownika"), PRINT_USERS(6, "Wy�wietlenie listy u�ytkownik�w");

    private int value;
    private String description;

    private Option(int value, String description) {
	this.value = value;
	this.description = description;
    }

    public int getValue() {
	return value;
    }

    public String getDescription() {
	return description;
    }

    @Override
    public String toString() {
	return value + " - " + description;
    }

    public static Option createFromInt(int option) {
	try {
	    return Option.values()[option];
	} catch (ArrayIndexOutOfBoundsException e) {
	    throw new NoSuchElementException("Brak elementu o wskazanym ID");
	}
    }
}
