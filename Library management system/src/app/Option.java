package app;

import java.util.NoSuchElementException;

public enum Option {

    EXIT(0, "Wyjœcie z programu"), ADD_BOOK(1, "Dodanie ksi¹¿ki"), ADD_MAGAZINE(2,
	    "Dodanie magazynu/ gazety"), PRINT_BOOKS(3, "Wyœwietlenie dostêpnych ksi¹¿ek"), PRINT_MAGAZINES(4,
		    "Wyœwietlenie dostêpnych magazynów/ksi¹¿ek"), ADD_USER(5,
			    "Dodanie nowego u¿ytkownika"), PRINT_USERS(6, "Wyœwietlenie listy u¿ytkowników");

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
