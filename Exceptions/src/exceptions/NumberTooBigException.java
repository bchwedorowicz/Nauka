package exceptions;

public class NumberTooBigException extends Exception {

	public NumberTooBigException(int number) {
		super("The number " + number + " was too big");
	}

}
